package thread_sincro;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame{
	public Ventana() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNuevoConsumidor = new JButton("Nuevo Consumidor");
		btnNuevoConsumidor.addActionListener(new BtnNuevoConsumidorActionListener());
		btnNuevoConsumidor.setBounds(130, 227, 129, 23);
		getContentPane().add(btnNuevoConsumidor);
		
		JLabel lblProductos = new JLabel("Productos: 0");
		lblProductos.setBackground(Color.ORANGE);
		lblProductos.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblProductos.setBounds(104, 54, 182, 63);
		getContentPane().add(lblProductos);
		
		setVisible(true);
		setSize(400, 350);
	}	
	private class BtnNuevoConsumidorActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Consumidor c1 = new Consumidor();
			new Thread(c1).start();
		}
	}
}
