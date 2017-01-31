package examenCliente;
import java.rmi.RemoteException;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;


public class MenuPrincipal extends JFrame{
	
	private static final long serialVersionUID = 4151073248812413647L;
	public MenuPrincipal() {
		
		getContentPane().setLayout(null);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new BtnInsertarActionListener());
		btnInsertar.setBounds(89, 58, 89, 23);
		getContentPane().add(btnInsertar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		btnEliminar.setBounds(89, 126, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnModifcar = new JButton("Modifcar");
		btnModifcar.addActionListener(new BtnModifcarActionListener());
		btnModifcar.setBounds(89, 92, 89, 23);
		getContentPane().add(btnModifcar);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new BtnMostrarActionListener());
		btnMostrar.setBounds(89, 160, 89, 23);
		getContentPane().add(btnMostrar);
		
		JLabel lblExamenRmi = new JLabel("Examen 270215 RMI - JDBC");
		lblExamenRmi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblExamenRmi.setBounds(10, 11, 254, 36);
		getContentPane().add(lblExamenRmi);
		
		setVisible(true);
		setSize(288, 229);
	}
	private class BtnInsertarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			new VentanaInsertar();
		}
	}
	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			try {
				new VentanaEliminar();
			} catch (RemoteException | SQLException e) {
				e.printStackTrace();
			}
		}
	}
	private class BtnModifcarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			try {
				new VentanaModificar();
			} catch (RemoteException e1) {
				e1.printStackTrace();
			}
		}
	}
	private class BtnMostrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			try {
				new VentanaMostrar();
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
	}
}
