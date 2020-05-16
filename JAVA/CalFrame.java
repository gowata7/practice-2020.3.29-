package day0515;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CalFrame extends JFrame{

	public CalFrame() {
		super("계산기");
		setSize(500,500);
		
		Container cp = getContentPane();
		cp.setBackground(Color.LIGHT_GRAY);
		cp.setLayout(new GridLayout(6,4,5,5));
		JButton b = new JButton();
		b.setSize(10,10);
		String str[] = {"%","CE","C","←","1/X","x^2","sqrt(x)","÷",
		"7","8","9","X","4","5","6","-","1","2","3","+","+/-","0",".","="
		};
		

	/*	cp.add(new JButton("%"));
		cp.add(new JButton("CE"));
		cp.add(new JButton("C"));
		cp.add(new JButton("←"));
		cp.add(new JButton("1/x"));
		cp.add(new JButton("x^2"));
		cp.add(new JButton("sqrt(x)"));
		cp.add(new JButton("÷"));
		cp.add(new JButton("7"));
		cp.add(new JButton("8"));
		cp.add(new JButton("9"));
		cp.add(new JButton("X"));
		cp.add(new JButton("4"));
		cp.add(new JButton("5"));
		cp.add(new JButton("6"));
		cp.add(new JButton("-"));
		cp.add(new JButton("1"));
		cp.add(new JButton("2"));
		cp.add(new JButton("3"));
		cp.add(new JButton("+"));
		cp.add(new JButton("+/-"));
		cp.add(new JButton("0"));
		cp.add(new JButton("."));
		cp.add(new JButton("="));
		*/
		for(int i=0; i<str.length; i++) {
			cp.add(new JButton(str[i]));
		}
		setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CalFrame();
	}

}
