import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class 김범준 extends JFrame{

	Container c;
	JLabel j1;
	JButton j2;
	JCheckBox j3, j31, j32;
	JRadioButton j5, j51;
	JTextField j6;
	JTextArea j7;
	JList j8;
	JComboBox j9;
	JSlider j10;
	ImageIcon icon = new ImageIcon("movie.png");
	ImageIcon apple = new ImageIcon("사과.jpg");
	String str[] = {"보안과","애동과","호텔과","조리과"};
	김범준() {
		setTitle("스윙 연습2");
		setSize(1000,700);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		j1=new JLabel("수박",icon,SwingConstants.LEFT);
		j1.setFont(new Font("궁서체",Font.BOLD,50));
		c.add(j1);
		
		j3=new JCheckBox("오렌지",true);
		j31=new JCheckBox("배");
		j32=new JCheckBox("사과",apple);
		c.add(j3);c.add(j31);c.add(j32);

		ButtonGroup g = new ButtonGroup();
		j5=new JRadioButton("남성");
		j51=new JRadioButton("여성");
		g.add(j5);g.add(j51);
		c.add(j5);c.add(j51);
		
		j6=new JTextField("이름", 10);
		c.add(j6);
		j7=new JTextArea(5,20);	// 
		c.add(j7);
		
		j8=new JList(str);
		c.add(j8);
		j9=new JComboBox(str);
		c.add(j9);
		j10=new JSlider(JSlider.HORIZONTAL,0,200,70);
		c.add(j10);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 김범준();
	}

}
