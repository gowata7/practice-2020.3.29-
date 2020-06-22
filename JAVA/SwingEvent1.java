import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEvent1 extends JFrame{
	JLabel b = new JLabel("@))~");
	ImageIcon icon = new ImageIcon("D:\\2017201062_2B\\Day0602\\src\\image.png");
	JButton bt;
	SwingEvent1()
	{
		
		setTitle("이벤트 연습");
		setSize(500,400);
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.yellow);
	
		add(b);
		b.setForeground(Color.red);
		b.setFont(new Font("궁서체", Font.BOLD, 25));
		b.setLocation(150,50);
		b.setSize(180,50);
		c.addMouseListener(new MyMouseAdapter()); // 노란색 영역에 마우스 이벤트 추가
		c.add(b);
		c.addKeyListener(new MyKey());
		bt = new JButton("그림",icon);
		bt.setBounds(50, 50, 220, 230);
		c.add(bt);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		// 마우스가 클릭 된 컴포넌트에게 포커스 설정
		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKey extends KeyAdapter{
		public void keyPressed(KeyEvent e) { // 키가 눌러질 때
			int key = e.getKeyChar(); // 문자코드를 리턴
			int keys = e.getKeyCode();
			if (key == 'q') {
				System.exit(0);
			}else if(keys == KeyEvent.VK_END) {
				System.exit(0);
			}
		}
	}
	
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); int y = e.getY();
			b.setLocation(x,y);
		}
	}
	
	/*
	  class MyMouse implements MouseListener{
		public void mouseClicked(MouseEvent e) {

		} // 마우스 버튼이 눌러질 때
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); int y = e.getY();
			b.setLocation(x,y);
		} // 눌러진 마우스 버튼을 때었을 때
		public void mouseReleased(MouseEvent e) {
			int x = e.getX(); int y = e.getY();
			b.setLocation(x,y);
		} // 마우스 버튼이 클릭될 때		
		public void mouseEntered(MouseEvent e) {} // 마우스 컴포넌트 위에 올라올 때
		public void mouseExited(MouseEvent e) {} // 컴포넌트 위에 올라온 마우스가 컴포넌트를 벗어날 때
	}
	*/
	public static void main(String[] args) {
		new SwingEvent1();
	}

}
