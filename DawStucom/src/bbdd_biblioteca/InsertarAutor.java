package bbdd_biblioteca;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class InsertarAutor extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTextField txtAutor;
	private JTextField txtApellidos;
	public InsertarAutor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(10, 10, 154, 50);
		getContentPane().add(lblAutor);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(174, 10, 200, 50);
		getContentPane().add(txtAutor);
		txtAutor.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 66, 154, 50);
		getContentPane().add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(174, 66, 200, 50);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JButton btnInsertarAutor = new JButton("Insertar Autor");
		btnInsertarAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					jButton1ActionPerformed();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			private void jButton1ActionPerformed() throws Exception {
				String Autor=txtAutor.getText();String Apellidos=txtApellidos.getText(); 
				if(Autor.length()==0 || Apellidos.length()==0){
					JOptionPane.showMessageDialog(null, "Algun dels dos parametres està buid, no es fa res...");
				}
				else{
					JOptionPane.showMessageDialog(null, "Dades introduides!");
					Principal.interconexion.insertarAutor(txtAutor.getText(),txtApellidos.getText());
					dispose();
					new MenuPrincipal();
				}
			}
		});
		btnInsertarAutor.setBounds(97, 127, 144, 23);
		getContentPane().add(btnInsertarAutor);
		
		setVisible(true);
		setSize(400,190);
	}
}