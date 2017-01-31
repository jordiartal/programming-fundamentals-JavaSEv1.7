package windows;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Window extends JFrame implements ActionListener{
	private JTextField textfield1;
	private JLabel label1, label2;
	private JButton bt1,bt2;
	public Window(){
		setLayout(null);
		bt1=new JButton("1");
		bt1.setBounds(10, 100, 90, 30);
		add(bt1);
		bt1.addActionListener((ActionListener)this);
		bt1.setBackground(Color.pink);
		
		bt2=new JButton("2");
		bt2.setBounds(110, 100, 90, 30);
		add(bt2);
		bt2.addActionListener((ActionListener)this);
		bt2.setForeground(Color.pink);
		
		label1=new JLabel ("Sistema de facturacion");
		label1.setBounds(10, 20, 300, 30);
		add(label1);
		
		label2=new JLabel ("Version 1.0");
		label2.setBounds(10, 100, 300, 30);
		add(label2);
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource()==bt1){
			setTitle("Boton 1");
		}
		if (e.getActionCommand().equals("2")){
			setTitle("Boton 2");
		}
	}
	
	
	public static void main (String[] ar) {
		Window formulario1=new Window();
		formulario1.setBounds(12, 20, 400,300);
		formulario1.setResizable(false);
		formulario1.setVisible(true);
	}
}