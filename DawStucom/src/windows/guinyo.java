package windows;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class guinyo extends JFrame implements ActionListener{
	private JButton bt3;
	public guinyo(){
		setLayout(null);
		ImageIcon ic1 = new ImageIcon("src/guiño.jpg");
		bt3=new JButton(ic1);
		bt3.setBounds(10, 10, 200, 200);
		add(bt3);
		bt3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==bt3){
			JOptionPane.showMessageDialog(null,";P");
		}
	}
	public static void main (String[] ar) {
		guinyo formulario1=new guinyo();
		formulario1.setBounds(12, 20, 400,300);
		formulario1.setResizable(false);
		formulario1.setVisible(true);
	}
}