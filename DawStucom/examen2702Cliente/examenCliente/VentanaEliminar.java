package examenCliente;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

import examenCliente.Principal;

import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaEliminar extends JFrame{
	
	private static final long serialVersionUID = 6476338762824266557L;
	private JComboBox<String> comboBoxPersona;

	public VentanaEliminar() throws RemoteException, SQLException {
		addWindowListener(new ThisWindowListener());
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//-----------------------------------------------------------------------------------
		//------------------COMBOBOX---------------------------------------------------------
		comboBoxPersona = new JComboBox<String>();
		comboBoxPersona.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		ArrayList<String> consulta = new ArrayList<String>();
		consulta = Principal.interconexion.rmiInterfaz.muestraPersonas();
		for(int i=0; i<consulta.size();i++){
			String[]persones = consulta.get(i).split("/");
			comboBoxPersona.addItem(persones[0]+" "+persones[1]+" "+persones[2]);
		}
		comboBoxPersona.setBounds(10, 11, 211, 20);
		getContentPane().add(comboBoxPersona);
		//-----------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------		
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		btnEliminar.setBounds(10, 42, 211, 23);
		getContentPane().add(btnEliminar);
		
		setSize(245, 117);
		setVisible(true);
	}
	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String[] seleccio = ((String) comboBoxPersona.getSelectedItem()).split(" ");
			int id = Integer.parseInt(seleccio[0]);
			try {
				Principal.interconexion.rmiInterfaz.eliminaPersona(id);				
			} catch (RemoteException e) {
				e.printStackTrace();
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
