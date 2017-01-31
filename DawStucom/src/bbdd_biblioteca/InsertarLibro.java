package bbdd_biblioteca;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsertarLibro extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextField txtTitulo;
	private JTextField txtIsbn;
	private JTextField txtPaginas;
	private JTextField txtGenero;
	private JComboBox<String> comboBoxAutor;
	private int codigo;
	
	public InsertarLibro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(10, 11, 78, 23);
		getContentPane().add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(10, 45, 78, 23);
		getContentPane().add(lblAutor);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setBounds(10, 79, 78, 23);
		getContentPane().add(lblIsbn);
		
		JLabel lblPaginas = new JLabel("Paginas");
		lblPaginas.setBounds(10, 113, 78, 23);
		getContentPane().add(lblPaginas);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(10, 146, 78, 23);
		getContentPane().add(lblGenero);
		
		txtTitulo = new JTextField();
		txtTitulo.setText("");
		txtTitulo.setBounds(78, 12, 152, 20);
		getContentPane().add(txtTitulo);
		txtTitulo.setColumns(10);
		
		comboBoxAutor = new JComboBox<String>();
		comboBoxAutor.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		comboBoxAutor.removeAllItems();
		ArrayList<String> llista = null;
		try {
			llista = Bibliobbdd.mostrarAutor();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		for(int i=0; i<llista.size();i++){
			comboBoxAutor.addItem(llista.get(i));
		}
		comboBoxAutor.setBounds(78, 45, 152, 23);
		getContentPane().add(comboBoxAutor);
		
		txtIsbn = new JTextField();
		txtIsbn.setText("");
		txtIsbn.setBounds(78, 80, 152, 20);
		getContentPane().add(txtIsbn);
		txtIsbn.setColumns(10);
		
		txtPaginas = new JTextField();
		txtPaginas.setText("");
		txtPaginas.setBounds(78, 114, 152, 20);
		getContentPane().add(txtPaginas);
		txtPaginas.setColumns(10);
		
		txtGenero = new JTextField();
		txtGenero.setText("");
		txtGenero.setBounds(78, 147, 152, 20);
		getContentPane().add(txtGenero);
		txtGenero.setColumns(10);
		
		JButton btnInsertarLibro = new JButton("Insertar Libro");
		btnInsertarLibro.addActionListener(new BtnInsertarLibroActionListener());
		btnInsertarLibro.setBounds(78, 178, 152, 23);
		getContentPane().add(btnInsertarLibro);
		
		setVisible(true);setSize(254, 254);
	}
	
	private class BtnInsertarLibroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				int titulo=txtTitulo.getText().length();
				int isbn=txtIsbn.getText().length();
				int pagina=txtPaginas.getText().length();
				int genero=txtGenero.getText().length(); 
				if(titulo==0 || isbn==0 || pagina==0 || genero==0){
					JOptionPane.showMessageDialog(null, "Algun dels dos parametres està buid, no es fa res...");
				}
				else{
					JOptionPane.showMessageDialog(null, "Dades introduides!");
					String texte=(String) comboBoxAutor.getSelectedItem();
					String [] texte_parts = texte.split(" ");
					codigo=Integer.parseInt(texte_parts[0]);
					Bibliobbdd.insertarLibro(txtTitulo.getText(), codigo, txtIsbn.getText(), Integer.parseInt(txtPaginas.getText()), txtGenero.getText());
					dispose();
					new MenuPrincipal();
				}
			} catch (NumberFormatException | SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
