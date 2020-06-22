import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame{
	Container c;
	JButton btn[] = new JButton[3];
	String s[] = {"사가", "오란지","메론"};
	String cr[] = {"red", "orange","green"};
	Test()
	{	
		setTitle("스윙 연습");
		setSize(300,400);
		c = getContentPane();
		//c.setLayout(new FlowLayout());
		c.setLayout(null);
		
		for(int i=0; i<btn.length;i++) {
			btn[i] = new JButton(s[i]);
			btn[i].setBounds(100,50*i,100,30);
			btn[i].addActionListener(new MyAction());
			c.add(btn[i]);
		}
		btn[0].setBackground(Color.red);btn[0].setForeground(Color.orange);
		btn[1].setBackground(Color.orange);btn[1].setForeground(Color.red);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test();
	}
	class MyAction implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			JButton bt = (JButton) ae.getSource();
			if(bt.getText().equals("사가")) {
				bt.setText("apple");
			}else if(bt.getText().equals("apple")) {
				bt.setText("사가");
			}
			if(bt.getText().equals("오란지")) {
				bt.setText("orange");
			}else if(bt.getText().equals("orange")) {
				bt.setText("오란지");
			}
			
		}
	}

}
