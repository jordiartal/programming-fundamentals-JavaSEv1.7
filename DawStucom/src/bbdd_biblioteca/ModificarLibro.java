package bbdd_biblioteca;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarLibro extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextField textTitulo;
	private JTextField textISBN;
	private JTextField textPaginas;
	private JTextField textGenero;
	private JComboBox<String> comboBoxAutor;
	private JComboBox<String> comboBoxLibro;
	ArrayList<String> llista=Bibliobbdd.mostrarLibro();
	ArrayList<String> llista_autor=Bibliobbdd.mostrarAutor();
	
	public ModificarLibro() throws SQLException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblSeleccionaLibro = new JLabel("Selecciona Libro");
		lblSeleccionaLibro.setBounds(10, 10, 200, 26);
		getContentPane().add(lblSeleccionaLibro);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(10, 74, 94, 20);
		getContentPane().add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(10, 100, 94, 20);
		getContentPane().add(lblAutor);
				
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setBounds(10, 126, 50, 20);
		getContentPane().add(lblIsbn);
		
		JLabel lblPaginas = new JLabel("Paginas");
		lblPaginas.setBounds(10, 153, 50, 20);
		getContentPane().add(lblPaginas);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(10, 179, 50, 26);
		getContentPane().add(lblGenero);
		
		//Omplim el combobox dels llibres
		comboBoxLibro = new JComboBox<String>();
		comboBoxLibro.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		comboBoxLibro.removeAllItems();
		for(int i=0; i<llista.size();i++){
			String[]texte_titols = llista.get(i).split("/");
			comboBoxLibro.addItem(texte_titols[0]+" "+texte_titols[1]);
		}
		comboBoxLibro.addItemListener(new ComboBoxLibroItemListener());
		comboBoxLibro.setBounds(10, 42, 200, 26);
		getContentPane().add(comboBoxLibro);
		
		textTitulo = new JTextField();
		textTitulo.setBounds(64, 74, 146, 20);
		getContentPane().add(textTitulo);
		textTitulo.setColumns(10);
		
		comboBoxAutor = new JComboBox<String>();
		comboBoxAutor.setBounds(64, 100, 146, 20);
		getContentPane().add(comboBoxAutor);
		
		textISBN = new JTextField();
		textISBN.setBounds(64, 126, 146, 20);
		getContentPane().add(textISBN);
		textISBN.setColumns(10);
			
		textPaginas = new JTextField();
		textPaginas.setBounds(64, 153, 146, 20);
		getContentPane().add(textPaginas);
		textPaginas.setColumns(10);
			
		textGenero = new JTextField();
		textGenero.setBounds(64, 184, 146, 20);
		getContentPane().add(textGenero);
		textGenero.setColumns(10);
		
		JButton btnModificarLibro = new JButton("Modificar Libro");
		btnModificarLibro.addActionListener(new BtnModificarLibroActionListener());
		btnModificarLibro.setBounds(10, 215, 200, 23);
		getContentPane().add(btnModificarLibro);
		
		setVisible(true);
		setSize(239, 300);
	}
	
	//Item Listener del combobox dels llibres, canvia els camps de sota, i el combobox autors
	private class ComboBoxLibroItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			String texte=(String) comboBoxLibro.getSelectedItem();
			String [] texte_parts = texte.split(" ");
			try {
				ArrayList<String> llista_ind=Bibliobbdd.mostrarLibroSelec(Integer.parseInt(texte_parts[0]));
				String[]dades_llibre=llista_ind.get(0).split("/");
				textTitulo.setText(dades_llibre[0]);
				textISBN.setText(dades_llibre[3]);
				textPaginas.setText(dades_llibre[4]);
				textGenero.setText(dades_llibre[5]);
				//codi del combobox nidificat
				comboBoxAutor.setModel(new DefaultComboBoxModel<String>(new String[] {}));
				for(int i=0; i<llista_autor.size();i++){
				comboBoxAutor.addItem(llista_autor.get(i));
				}
				comboBoxAutor.setSelectedIndex(Integer.parseInt(dades_llibre[6])-1);
			} 
			catch (NumberFormatException | SQLException a){
				a.printStackTrace();
			}			
		}
	}
	private class BtnModificarLibroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String autorselec=(String) comboBoxAutor.getSelectedItem();
			String[]autor_selec=autorselec.split(" ");
			String libro_selec= (String) comboBoxLibro.getSelectedItem();
			String[] libroselec=libro_selec.split(" ");
			try {
				Bibliobbdd.modificarLibro(Integer.parseInt(libroselec[0]),textTitulo.getText(),Integer.parseInt(autor_selec[0]),
						textISBN.getText(),Integer.parseInt(textPaginas.getText()),textGenero.getText());
			} catch (NumberFormatException | SQLException e) {
				e.printStackTrace();
			}
			dispose();
			new MenuPrincipal();
		}
	}
}