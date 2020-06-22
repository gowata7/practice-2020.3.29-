import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Graphic_image extends JFrame implements ActionListener{

    	private BufferedImage pic;
		String str;
		JPanel jp = new JPanel();
		JLabel jl = new JLabel("한성희 완전체");
		JButton btn1 = new JButton("이전");
		JButton btn2 = new JButton("다음");
		
		Graphic_image(String str){
			super(str);
			Container c = getContentPane();
			setSize(500,500);
			c.add(new MyPanels(),BorderLayout.CENTER);

			jp.setBackground(Color.YELLOW);
			jl.setForeground(Color.blue);
			jl.setFont(new Font("궁서",Font.BOLD,45));
			jp.add(jl);
	        jp.add(btn1);
	        btn1.addActionListener(this);
	        jp.add(btn2);
	        btn2.addActionListener(this);
			c.add(jp,BorderLayout.SOUTH);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
		}

		class MyPanels extends JPanel{
			
			ImageIcon ico = new ImageIcon("C:\\Users\\1-705-18\\Desktop\\1.jpg");
			Image img = ico.getImage();
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); 
			}
		}
		
	    public void actionPerformed(ActionEvent e) {
	        
	        
	        if (e.getSource() == btn1) {
				ImageIcon ico = new ImageIcon("C:\\Users\\1-705-18\\Desktop\\2.jpg");
				Image img = ico.getImage();
	        } else {
				ImageIcon ico = new ImageIcon("C:\\Users\\1-705-18\\Desktop\\3.jpg");
				Image img = ico.getImage();
	        }
	        
	        
	    }

	public static void main(String[] args) {
		new Graphic_image("마이 그림");

	}

}
