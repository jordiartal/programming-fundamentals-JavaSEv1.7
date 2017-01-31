package bbdd_biblioteca;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

import javax.swing.JScrollPane;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




public class Listados extends JFrame{
	private static final long serialVersionUID = 1L;	
	private JComboBox<String> comboBoxAutor;
	private JComboBox<String> comboBoxGenero;
	
	//----jtable definim el model, despres creem el objecte--------------------
	DefaultTableModel taulaMod = new DefaultTableModel();
	JTable taula=new JTable(taulaMod);
	

	public Listados() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		//COMBO BOX AUTOR-----------------------------------------------------------------------------
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
		comboBoxAutor.setBounds(10, 70, 200, 23);
		getContentPane().add(comboBoxAutor);
		//---------------------------------------------------------------------------------------------

		//COMBO BOX GENERO-----------------------------------------------------------------------------
		comboBoxGenero = new JComboBox<String>();
		comboBoxGenero.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		comboBoxGenero.removeAllItems();
		ArrayList<String> llistagen = null;
		try {
			llistagen = Bibliobbdd.mostrarGenero();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(int i=0; i<llistagen.size();i++){
			comboBoxGenero.addItem(llistagen.get(i));
		}				
		comboBoxGenero.setBounds(220, 70, 200, 23);
		getContentPane().add(comboBoxGenero);
		//---------------------------------------------------------------------------------------------

		JLabel lblAutor = new JLabel("Selecciona Autor");
		lblAutor.setBounds(10, 46, 92, 24);
		getContentPane().add(lblAutor);

		JLabel lblGenero = new JLabel("Selecciona Genero");
		lblGenero.setBounds(220, 45, 103, 26);
		getContentPane().add(lblGenero);

		JLabel lblSeleccionaElCriterio = new JLabel("Selecciona el Criterio de Busqueda");
		lblSeleccionaElCriterio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSeleccionaElCriterio.setBounds(115, 11, 200, 24);
		getContentPane().add(lblSeleccionaElCriterio);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new BtnBuscarActionListener());
		btnBuscar.setBounds(174, 112, 89, 23);
		getContentPane().add(btnBuscar);

		JButton btnMenu = new JButton("Menu Principal");
		btnMenu.addActionListener(new BtnNewButtonActionListener());
		btnMenu.setBounds(115, 393, 200, 23);
		getContentPane().add(btnMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 150, 410, 236);
		getContentPane().add(scrollPane);
		
		taula = new JTable(taulaMod);
		scrollPane.setViewportView(taula);
		
		setVisible(true);
		setSize(448,464);
		
		
	}
	private class BtnBuscarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				String codigoAut=(String) comboBoxAutor.getSelectedItem();
				String[]codigo_Aut=codigoAut.split(" ");
				String extGen=(String) comboBoxGenero.getSelectedItem();
				String query="select * from libro where codigo_autor="+codigo_Aut[0]+" and genero='"+extGen+"'";
				ResultSet llista = Bibliobbdd.consultaLibros(query);
//TAULA-------------------------------------------------------------------------------------------------------------------
				taulaMod.setRowCount(0);
				String[] tableColumnsName = {"codigo","titulo","cod.autor","ISBN","paginas","genero"}; 
				taulaMod.setColumnIdentifiers(tableColumnsName);
				java.sql.ResultSetMetaData rsmd = llista.getMetaData();
				int colNo = rsmd.getColumnCount();
				while(llista.next()){
					Object[] objects = new Object[colNo];
					for(int i=0;i<colNo;i++){
						objects[i]=llista.getObject(i+1);
					}
					taulaMod.addRow(objects);
				}
				taula.setModel(taulaMod);
//TAULA--------------------------------------------------------------------------------------------------------------------
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			new MenuPrincipal();
		}
	}
}