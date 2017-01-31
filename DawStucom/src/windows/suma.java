package windows;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class suma extends JFrame implements ActionListener{
	private JTextField textfield1,textfield2;
	private JLabel label1,label2,label3;
	private JButton bt1;
	public suma(){
		setLayout(null);
		
		label1=new JLabel ("sumand 1");
		label1.setBounds(10, 10, 300, 30);
		add(label1);
		
		label2=new JLabel ("sumand 2");
		label2.setBounds(10, 30, 300, 30);
		add(label2);
		
		label3=new JLabel ("resultat");
		label3.setBounds(10, 60, 300, 30);
		add(label3);
		
		textfield1=new JTextField();
		textfield1.setBounds(10, 100,30,30);
		add(textfield1);
		
		textfield2=new JTextField();
		textfield2.setBounds(10,140,30,30);
		add(textfield2);
		
		bt1=new JButton("suma!");
		bt1.setBounds(10, 180, 100, 30);
		add(bt1);
		bt1.addActionListener((ActionListener)this);
		

		
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource()==bt1){
			int cad=(Integer.parseInt(textfield1.getText()))+(Integer.parseInt(textfield2.getText()));
			String resultat=Integer.toString(cad);
			setTitle(resultat);
		}
	}
	
	
	public static void main (String[] ar) {
		suma formulario1=new suma();
		formulario1.setBounds(12, 20, 400,300);
		formulario1.setResizable(false);
		formulario1.setVisible(true);
	}
}