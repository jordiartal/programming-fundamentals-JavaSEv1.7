package bbdd_biblioteca;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.sql.SQLException;


public class MenuPrincipal extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.WHITE);

		getContentPane().setLayout(null);
		
		JButton btnInsertarAutor = new JButton("Insertar Autor");
		btnInsertarAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 dispose();
			     new InsertarAutor();
			}
		});
		btnInsertarAutor.setBounds(10, 11, 131, 23);
		getContentPane().add(btnInsertarAutor);
		
		JButton btnModificarAutor = new JButton("Modificar Autor");
		btnModificarAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				try {
					new modificarAutor();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		});
		btnModificarAutor.setBounds(10, 66, 131, 23);
		getContentPane().add(btnModificarAutor);
		
		JButton btnEliminarAutor = new JButton("Eliminar Autor");
		btnEliminarAutor.addActionListener(new BtnEliminarAutorActionListener());
		btnEliminarAutor.setBounds(10, 113, 131, 23);
		getContentPane().add(btnEliminarAutor);
		
		JButton btnInsertarLibro = new JButton("Insertar Libro");
		btnInsertarLibro.addActionListener(new BtnInsertarLibroActionListener());
		btnInsertarLibro.setBounds(172, 11, 117, 23);
		getContentPane().add(btnInsertarLibro);
		
		JButton btnModificarLibro = new JButton("Modificar Libro");
		btnModificarLibro.addActionListener(new BtnModificarLibroActionListener());
		btnModificarLibro.setBounds(172, 66, 117, 23);
		getContentPane().add(btnModificarLibro);
			
		JButton btnEliminarLibro = new JButton("Eliminar Libro");
		btnEliminarLibro.addActionListener(new BtnEliminarLibroActionListener());
		btnEliminarLibro.setBounds(172, 113, 117, 23);
		getContentPane().add(btnEliminarLibro);
		
		JButton btnListados = new JButton("Listados");
		btnListados.addActionListener(new BtnListadosActionListener());
		btnListados.setBounds(108, 175, 89, 23);
		getContentPane().add(btnListados);
		
		setVisible(true);
		setSize(325,247);
	}
	
	private class BtnEliminarAutorActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			try {
				new EliminarAutor();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	private class BtnInsertarLibroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			new InsertarLibro();
		}
	}
	private class BtnModificarLibroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			try {
				new ModificarLibro();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	private class BtnEliminarLibroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			new EliminarLibro();
		}
	}
	private class BtnListadosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			new Listados();
		}
	}
}
