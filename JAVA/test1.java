import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class test1 extends JFrame{
		
		String str;
		JPanel jp = new JPanel();
		JLabel jl = new JLabel("ÀÛ¼ºÀÚ : °«¼ºÈñ");
		
		test1(String str){
			super(str);
			Container c = getContentPane();
			setSize(500,500);
			c.add(new MyPanels(),BorderLayout.CENTER);

			jp.setBackground(Color.YELLOW);
			jl.setForeground(Color.blue);
			jl.setFont(new Font("±Ã¼­",Font.BOLD,45));
			jp.add(jl);
			c.add(jp,BorderLayout.SOUTH);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
		}

		class MyPanels extends JPanel{
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				for(int i=0; i<3; i++) {
					int a = (int)(Math.random()*255+1);
					int b = (int)(Math.random()*255+1);
					int c = (int)(Math.random()*255+1);
					g.setColor(new Color(a,b,c));
					g.fillArc(150, 150, 150, 150, 90+i*120, 120);
				}
				
			}
		}

	public static void main(String[] args) {
		new test1("È£ ±×¸®±â");

	}

}
