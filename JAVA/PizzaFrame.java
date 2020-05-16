package day0515;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PizzaFrame extends JFrame{
	public PizzaFrame() {
		super("피자 목록");
		setSize(400,400);
		
		Container cp = getContentPane();
		cp.setBackground(Color.yellow);
		// cp.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		// cp.setLayout(new borderLayout(30,20));
		cp.setLayout(new GridLayout(2,3,10,20)); // 10이 가로갭, 20 세로갭
		cp.setLayout(null);
		JButton b = new JButton("OK");
		b.setLocation(150,250);
		b.setSize(100,30);
		cp.add(b);
		
	    cp.add(new JButton("콤비네이션"),BorderLayout.WEST);
	    cp.add(new JButton("포테이토"),BorderLayout.EAST);
	    cp.add(new JButton("고구마"),BorderLayout.SOUTH);
	    cp.add(new JButton("치즈크러스트"),BorderLayout.NORTH);
	    
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new PizzaFrame();
	}

}
