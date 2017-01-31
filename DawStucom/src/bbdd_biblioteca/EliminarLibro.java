package bbdd_biblioteca;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarLibro extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> comboBoxLibro;
	
	public EliminarLibro() {
		getContentPane().setLayout(null);
		
		comboBoxLibro = new JComboBox<String>();
		comboBoxLibro.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		comboBoxLibro.removeAllItems();
		ArrayList<String> llista = null;
		try {
			llista = Bibliobbdd.mostrarLibro();
			for(int i=0; i<llista.size();i++){
				String[]texte_titols = llista.get(i).split("/");
				comboBoxLibro.addItem(texte_titols[0]+" "+texte_titols[1]);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		comboBoxLibro.setBounds(8, 33, 202, 25);
		getContentPane().add(comboBoxLibro);
		
		JButton btnEliminarLibro = new JButton("Eliminar Libro");
		btnEliminarLibro.addActionListener(new BtnEliminarLibroActionListener());
		btnEliminarLibro.setBounds(8, 69, 202, 23);
		getContentPane().add(btnEliminarLibro);
		
		JLabel lblEscogeElLibro = new JLabel("Escoge el libro:");
		lblEscogeElLibro.setBounds(10, 10, 200, 25);
		getContentPane().add(lblEscogeElLibro);
		
		setVisible(true);
		setSize(258, 158);
	}
	private class BtnEliminarLibroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				String texte = (String)comboBoxLibro.getSelectedItem();
				String [] texte_parts = texte.split(" ");
				int codigo=Integer.parseInt(texte_parts[0]);
				if(codigo>0){
					Bibliobbdd.eliminarLibro(codigo);
				}
			} catch (SQLException e1){
				e1.printStackTrace();
			}
			dispose();
			new MenuPrincipal();
		}
	}
}
