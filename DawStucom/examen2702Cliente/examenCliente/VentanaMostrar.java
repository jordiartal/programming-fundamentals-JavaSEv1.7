package examenCliente;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import examenCliente.Principal;

import javax.swing.JLabel;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class VentanaMostrar extends JFrame{
	private static final long serialVersionUID = -8108437356818164854L;
	private JTextField txtNombre;
	private JTextField txtEdad;
	JComboBox<String>ComboboxMostrar;
	
	public VentanaMostrar() throws RemoteException {
		addWindowListener(new ThisWindowListener());
		getContentPane().setLayout(null);
		
		ComboboxMostrar = new JComboBox<String>();
		ComboboxMostrar.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		
		ArrayList<String> consulta = new ArrayList<String>();
		consulta = Principal.interconexion.rmiInterfaz.muestraPersonas();
		for(int i=0; i<consulta.size();i++){
			String[]persones = consulta.get(i).split("/");
			ComboboxMostrar.addItem(persones[0]+"-"+persones[1]+"-"+persones[2]);
		}
		ComboboxMostrar.setSelectedItem(ComboboxMostrar.getSelectedItem());
		ComboboxMostrar.addItemListener(new ComboboxModificarItemListener());	
		ComboboxMostrar.setBounds(10, 11, 197, 20);
		getContentPane().add(ComboboxMostrar);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(56, 44, 151, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setText("Edad");
		txtEdad.setBounds(56, 75, 151, 20);
		getContentPane().add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 47, 46, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(10, 78, 36, 14);
		getContentPane().add(lblEdad);
		
		JButton btnVolverAlMenu = new JButton("Volver al Menu");
		btnVolverAlMenu.addActionListener(new BtnVolverAlMenuActionListener());
		btnVolverAlMenu.setBounds(10, 103, 197, 23);
		getContentPane().add(btnVolverAlMenu);

		setVisible(true);
		setSize(233,175);
	}
	private class ComboboxModificarItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
			String texte=(String) ComboboxMostrar.getSelectedItem();
			String [] texte_parts = texte.split("-");
			txtNombre.setText(texte_parts[1]);
			txtEdad.setText(texte_parts[2]);
		}
	}
	private class BtnVolverAlMenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			new MenuPrincipal();
		}
	}
	private class ThisWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent arg0) {
			dispose();
			new MenuPrincipal();
		}
	}	
}
