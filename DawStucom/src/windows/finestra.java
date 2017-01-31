package windows;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class finestra extends JFrame implements ActionListener{
	private JTextField textfield1;
	private JLabel label1;
	private JButton bt1;
	public finestra(){
		setLayout(null);
		
		label1=new JLabel ("titulo de la ventana");
		label1.setBounds(10, 10, 300, 30);
		add(label1);
		
		textfield1=new JTextField();
		textfield1.setBounds(10,50,300,30);
		add(textfield1);
		
		bt1=new JButton("Ok!");
		bt1.setBounds(10, 100, 100, 30);
		add(bt1);
		bt1.addActionListener((ActionListener)this);
		
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource()==bt1){
			String cad=textfield1.getText();
			setTitle(cad);
		}
	}
	
	
	public static void main (String[] ar) {
		finestra formulario1=new finestra();
		formulario1.setBounds(12, 20, 400,300);
		formulario1.setResizable(false);
		formulario1.setVisible(true);
	}
}