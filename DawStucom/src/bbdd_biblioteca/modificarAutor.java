package bbdd_biblioteca;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;


public class modificarAutor extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JComboBox<String> comboBoxAutor;
	private int codigo;
	
	public modificarAutor() throws SQLException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblSelecionaAutor = new JLabel("Seleciona Autor");
		lblSelecionaAutor.setBounds(68, 0, 86, 50);
		getContentPane().add(lblSelecionaAutor);
		
		//CODI DEL COMBO BOX ----------------------------------------------------------------------
		comboBoxAutor = new JComboBox<String>();
		comboBoxAutor.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		comboBoxAutor.removeAllItems();
		ArrayList<String>llista=Bibliobbdd.mostrarAutor();
		for(int i=0; i<llista.size();i++){
			comboBoxAutor.addItem(llista.get(i));
		}
		comboBoxAutor.addItemListener(new ComboBoxAutorItemListener());
		comboBoxAutor.setBounds(68, 55, 200, 34);
		getContentPane().add(comboBoxAutor);
		//-----------------------------------------------------------------------------------------
		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 111, 52, 50);
		getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 167, 52, 50);
		getContentPane().add(lblApellidos);
		
		txtNombre = new JTextField();
		
		txtNombre.setBounds(68, 111, 200, 50);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		
		txtApellidos.setBounds(68, 167, 200, 50);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JButton btnInsertar = new JButton("Modificar");
		btnInsertar.addActionListener(new BtnInsertarActionListener());
		btnInsertar.setBounds(95, 228, 89, 23);
		getContentPane().add(btnInsertar);
		
		setVisible(true);
		setSize(290,300);
	}
	public class ComboBoxAutorItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			String texte=(String) comboBoxAutor.getSelectedItem();
			String [] texte_parts = texte.split(" ");
			txtNombre.setText(texte_parts[1]);
			txtApellidos.setText(texte_parts[2]);
			codigo=Integer.parseInt(texte_parts[0]);
		}
	}
	private class BtnInsertarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				Bibliobbdd.modificarAutor(codigo, txtNombre.getText(), txtApellidos.getText());
				dispose();
				new MenuPrincipal();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}