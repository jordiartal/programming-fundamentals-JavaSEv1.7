package bbdd_biblioteca;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;



import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarAutor extends JFrame{
	
	private int codigo;
	private static final long serialVersionUID = 1L;
	private JComboBox<String> comboBoxAutor;
	
	public EliminarAutor() throws SQLException {
		getContentPane().setLayout(null);
		
		JLabel lblEligeAutor = new JLabel("Elige el Autor que quieres eliminar");
		lblEligeAutor.setBounds(10, 11, 200, 26);
		getContentPane().add(lblEligeAutor);
		
		comboBoxAutor = new JComboBox<String>();
		comboBoxAutor.setModel(new DefaultComboBoxModel<String>(new String[]{}));
		comboBoxAutor.setBounds(10, 40, 200, 26);
		getContentPane().add(comboBoxAutor);
		comboBoxAutor.removeAllItems();
		ArrayList<String>llista=Bibliobbdd.mostrarAutorSense();
		for(int i=0; i<llista.size();i++){
			comboBoxAutor.addItem(llista.get(i));
		}
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		btnEliminar.setBounds(10, 77, 89, 23);
		getContentPane().add(btnEliminar);
		
		setVisible(true);
		setSize(258, 158);
	}
	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				String texte = (String)comboBoxAutor.getSelectedItem();
				String [] texte_parts = texte.split(" ");
				codigo=Integer.parseInt(texte_parts[0]);
				if(codigo>0){
					Bibliobbdd.EliminarAutor(codigo);
				}
			} catch (SQLException e){
				e.printStackTrace();
			}
			dispose();
			new MenuPrincipal();
		}
	}
}
