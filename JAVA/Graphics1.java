import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics1 extends JFrame{
	
	String str;
	Graphics1(String str){
		super(str);
		setSize(400,500);
		setContentPane(new Myg());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class Myg extends JPanel{
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.setFont(new Font("돋움",Font.ITALIC,30));
			g.drawString("안녕하세욤", 50, 50);
			g.setColor(new Color(255,0,255));
			g.drawString("안녕하세욤", 100, 100);;
			g.setColor(new Color(0x00ffff));
			g.drawString("안녕하세욤", 150, 150);
			g.setColor(new Color(0x0014ff));
			g.drawLine(100, 200, 350, 300);	// 선
			g.setColor(new Color(0x7814ff));
			g.drawRect(100, 200, 50, 50); // 사각형
			g.setColor(new Color(0x7814ff));
			g.drawOval(200,300, 50, 50); // 타원형
			g.setColor(new Color(0xffff00));
			g.drawRoundRect(150, 200, 100, 200, 30, 50); // 모서리가 둥근 사각형
			g.setColor(new Color(123,56,78));
			g.fillRect(200, 150, 100, 100);	// 채워진 사각형
			
			g.setColor(new Color(123,56,78));
			int x[] = {80,40,80,120};
			int y[] = {40,120,200,120};
			g.drawPolygon(x,y,4);
			
			int i=0;
			while(i<3){
				int a = (int) (Math.random()*255+1);
				int b = (int) (Math.random()*255+1);
				int c = (int) (Math.random()*255+1);
				g.setColor(new Color(a,b,c));
				g.fillArc(300, 190, 50, 50, 0, 270); // 채워진 호
				g.fillArc(a, b, b, c, a, b);
				i++;
			}
			
		}
	}
	
	/*public void paint(Graphics g) {
		super.paint(g);	// 이전의 잔상을 지운다.
		g.setColor(Color.red);
		g.drawString("안냥안냥", 100, 100);
	}*/
	public static void main(String[] args) {
		new Graphics1("나의 그륌");
	}

}
