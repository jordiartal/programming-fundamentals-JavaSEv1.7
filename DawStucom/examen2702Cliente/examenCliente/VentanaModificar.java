package examenCliente;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import examenCliente.Principal;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class VentanaModificar extends JFrame{
	private static final long serialVersionUID = -8108437356818164854L;
	private JTextField txtNombre;
	private JTextField txtEdad;
	JComboBox<String>ComboboxModificar;
	
	public VentanaModificar() throws RemoteException {
		addWindowListener(new ThisWindowListener_1());
		getContentPane().setLayout(null);
		
		ComboboxModificar = new JComboBox<String>();
		ComboboxModificar.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		
		ArrayList<String> consulta = new ArrayList<String>();
		consulta = Principal.interconexion.rmiInterfaz.muestraPersonas();
		for(int i=0; i<consulta.size();i++){
			String[]persones = consulta.get(i).split("/");
			ComboboxModificar.addItem(persones[0]+"-"+persones[1]+"-"+persones[2]);
		}
		ComboboxModificar.addItemListener(new ComboboxModificarItemListener());
		
		
		ComboboxModificar.setBounds(10, 11, 197, 20);
		getContentPane().add(ComboboxModificar);
		
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
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new BtnModificarActionListener());
		btnModificar.setBounds(10, 106, 197, 23);
		getContentPane().add(btnModificar);
		
		setVisible(true);
		setSize(233,175);
	}

	private class ComboboxModificarItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
			String texte=(String) ComboboxModificar.getSelectedItem();
			String [] texte_parts = texte.split("-");
			txtNombre.setText(texte_parts[1]);
			txtEdad.setText(texte_parts[2]);
		}
	}
	private class BtnModificarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String texte=(String) ComboboxModificar.getSelectedItem();
			String [] texte_parts = texte.split("-");
			int id=Integer.parseInt(texte_parts[0]);
			String Nombre=txtNombre.getText();
			int edad = Integer.parseInt(txtEdad.getText());
			try {
				Principal.interconexion.rmiInterfaz.modificaPersona(id, Nombre, edad);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			dispose();
			new MenuPrincipal();
		}
	}
	
	private class ThisWindowListener_1 extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
			new MenuPrincipal();
		}
	}
}
