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
			g.setFont(new Font("����",Font.ITALIC,30));
			g.drawString("�ȳ��ϼ���", 50, 50);
			g.setColor(new Color(255,0,255));
			g.drawString("�ȳ��ϼ���", 100, 100);;
			g.setColor(new Color(0x00ffff));
			g.drawString("�ȳ��ϼ���", 150, 150);
			g.setColor(new Color(0x0014ff));
			g.drawLine(100, 200, 350, 300);	// ��
			g.setColor(new Color(0x7814ff));
			g.drawRect(100, 200, 50, 50); // �簢��
			g.setColor(new Color(0x7814ff));
			g.drawOval(200,300, 50, 50); // Ÿ����
			g.setColor(new Color(0xffff00));
			g.drawRoundRect(150, 200, 100, 200, 30, 50); // �𼭸��� �ձ� �簢��
			g.setColor(new Color(123,56,78));
			g.fillRect(200, 150, 100, 100);	// ä���� �簢��
			
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
				g.fillArc(300, 190, 50, 50, 0, 270); // ä���� ȣ
				g.fillArc(a, b, b, c, a, b);
				i++;
			}
			
		}
	}
	
	/*public void paint(Graphics g) {
		super.paint(g);	// ������ �ܻ��� �����.
		g.setColor(Color.red);
		g.drawString("�ȳɾȳ�", 100, 100);
	}*/
	public static void main(String[] args) {
		new Graphics1("���� �׷�");
	}

}
