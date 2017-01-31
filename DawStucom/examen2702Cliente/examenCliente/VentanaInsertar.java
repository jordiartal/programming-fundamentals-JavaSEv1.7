package examenCliente;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import examenCliente.Principal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class VentanaInsertar extends JFrame{

	private static final long serialVersionUID = 4754042955827464493L;
	private JTextField txtNombre;
	private JTextField txtEdad;
	
	public VentanaInsertar() {
		addWindowListener(new ThisWindowListener());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new BtnInsertarActionListener());
		btnInsertar.setBounds(10, 73, 122, 23);
		getContentPane().add(btnInsertar);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(10, 11, 122, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setText("Edad");
		txtEdad.setBounds(10, 42, 122, 20);
		getContentPane().add(txtEdad);
		txtEdad.setColumns(10);
		
		setVisible(true);
		setSize(154, 146);
	}
	private class BtnInsertarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String nombre = txtNombre.getText();
			int edad = Integer.parseInt(txtEdad.getText());
			try {
				Principal.interconexion.rmiInterfaz.guardaPersona(nombre, edad);
			} catch (RemoteException e1) {
				e1.printStackTrace();
			}
			dispose();
			new MenuPrincipal();
		}
	}
	private class ThisWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
			new MenuPrincipal();
		}
	}
}
