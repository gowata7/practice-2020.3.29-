package day0515;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		super("나의 창"); // setTitle("나의 창);
		setSize(300,300);
		
		Container cp = getContentPane();
		cp.setBackground(Color.orange);
		cp.setLayout(new FlowLayout());
		JButton b = new JButton("yes");
		
		cp.add(new JButton("OK"));
		cp.add(new JButton("Cancel"));
		cp.add(new JButton("Ignore"));
		cp.add(b);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
