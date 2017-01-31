package thread_carreraCamellos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame{
	
	private static JLabel label1;
	private static JLabel label2;
	private static JLabel label3;
	private static camello c1;
	private static camello c2;
	private static camello c3;
	
	public Principal() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		label1 = new JLabel("Nicolas");
		label1.setIcon(new ImageIcon("C:\\Projectes\\DawStucom\\Luna\\thread_camello\\src\\camello-imagen-animada-0014.gif"));
		label1.setBounds(10, 11, 60, 60);
		getContentPane().add(label1);
		
		label2 = new JLabel("Mashoufan");
		label2.setIcon(new ImageIcon("C:\\Projectes\\DawStucom\\Luna\\thread_camello\\src\\camello-imagen-animada-0014.gif"));
		label2.setBounds(10, 87, 60, 60);
		getContentPane().add(label2);
		
		label3 = new JLabel("nadaaaaa");
		label3.setIcon(new ImageIcon("C:\\Projectes\\DawStucom\\Luna\\thread_camello\\src\\camello-imagen-animada-0014.gif"));
		label3.setBounds(10, 170, 60, 60);
		getContentPane().add(label3);
		
		JButton btnComenar = new JButton("Comen\u00E7ar");
		btnComenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread(c1).start();
				new Thread(c2).start();
				new Thread(c3).start();
			}
		});
		btnComenar.setBounds(258, 239, 89, 23);
		getContentPane().add(btnComenar);
		
		setSize(600, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Principal();
		c1 = new camello(label1,"Nicolas");
		c2 = new camello(label2,"Mashoufan");
		c3 = new camello(label3,"nadaaaaa");
		musica m = new musica();
		new Thread(m).start();
	}
}
