package windows;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class equals extends JFrame implements ActionListener{
	private JTextField textfield1,textfield2;
	private JLabel label1,label2;
	private JButton bt1;
	public equals(){
		setLayout(null);
		
		label1=new JLabel ("nom");
		label1.setBounds(10, 10, 75, 30);
		add(label1);
		
		textfield1=new JTextField();
		textfield1.setBounds(100, 10, 200,30);
		add(textfield1);
		
		label2=new JLabel ("password");
		label2.setBounds(10, 40, 75, 30);
		add(label2);
				
		textfield2=new JTextField();
		textfield2.setBounds(100, 40,200,30);
		add(textfield2);
		
		bt1=new JButton("comprova password");
		bt1.setBounds(100, 75, 200, 30);
		add(bt1);
		bt1.addActionListener((ActionListener)this);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==bt1){
			if((textfield1.getText()).equals(textfield2.getText())){
				JOptionPane.showMessageDialog(null,"es correcte");	
			}
			else{
				JOptionPane.showMessageDialog(null,"es incorrecte");
			}
		}
	}
	
	public static void main (String[] ar) {
		equals formulario1=new equals();
		formulario1.setBounds(12, 20, 400,300);
		formulario1.setResizable(false);
		formulario1.setVisible(true);
	}
}