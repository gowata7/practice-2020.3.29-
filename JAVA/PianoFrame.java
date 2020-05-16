package day0515;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
public class PianoFrame extends JFrame{

	public PianoFrame() {
		super("피아노 건반");
		setSize(1000,350);
		
		Container cp = getContentPane();
		cp.setBackground(Color.LIGHT_GRAY);
		//cp.setLayout(new GridLayout(1,12,10,10));
		cp.setLayout(null);
		
		
		for(int i=1; i<=12; i++) {
			JButton b = new JButton("c"+i);
		
			b.setLocation((i-1)*70,1);
			b.setSize(60,250);
			cp.add(b);
			if(i==1) {
				b.setLocation(5,1);
			}
		}
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new PianoFrame();
	}

}
