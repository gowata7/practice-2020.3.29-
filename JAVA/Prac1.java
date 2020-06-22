import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Practice1 extends JFrame{

	JLabel l = new JLabel("Start");
	JButton b[] = new JButton[3];
	Container c = getContentPane();
	
	Practice1(){
		
		setTitle("GAME");
		setSize(400,400);
		
		c.setLayout(new FlowLayout());
		c.setBackground(Color.green);
		c.add(l);
		
		
		for(int i=0; i<b.length; i++) {
			// b[i] = new JButton(str[]i]);
			b[i] = new JButton(Integer.toString(0));
			b[i].setBackground(Color.darkGray);
			b[i].setForeground(Color.white);
			c.add(b[i]);
		}

		
		
		c.addKeyListener(new Enter());
		
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	class Enter extends KeyAdapter{
		public void keyPressed(KeyEvent e)  {
			int key = e.getKeyChar();
			int num[] = new int[3];
			if(key == '\n') {
				for(int i=0; i<b.length; i++) {
					num[i] = (int) (Math.random()*3+1);
					b[i].setText(Integer.toString(num[i]));
					c.add(b[i]);
					}
					if(num[0]==num[1] && num[1]==num[2]) {
					//if((b[0].getText()== && b[1].getText().contentEquals("1") && b[2].getText().contentEquals("1")) || (b[0].getText().contentEquals("2") && b[1].getText().contentEquals("2") && b[2].getText().contentEquals("2")) || (b[0].getText().contentEquals("3") && b[1].getText().contentEquals("3") && b[2].getText().contentEquals("3"))){
						l.setText("축하합니다");
					}else {
						l.setText("start");
					}
						
			}
			
		}
				
	}
	
	public static void main(String[] args) {
		new Practice1();
	}

}
