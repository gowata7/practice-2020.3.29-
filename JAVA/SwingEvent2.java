import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SwingEvent2 extends JFrame{
	JLabel jb = new JLabel("선택");
	Container c;
	JMenu file;
	JMenuItem newFile;
	SwingEvent2(){
		setTitle("메뉴 만들기");
		setSize(500,300);
		c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		jb.setBounds(150, 80, 300, 50);
		jb.setForeground(Color.blue);
		jb.setFont(new Font("굴림체", Font.BOLD, 25));
		c.add(jb);
		menu();
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void menu() {
		JMenuBar mb = new JMenuBar();
		mb.setBackground(Color.green);
		file = new JMenu("파일");
		
		mb.add(file);
		file.add(new JMenuItem("새로 만들기")).addActionListener(new MyAction());
		file.addSeparator();
		file.add(new JMenuItem("새 창")).addActionListener(new MyAction());
		file.add(new JMenuItem("배경색")).addActionListener(new MyAction());
		setJMenuBar(mb);
	}
	class MyAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			String n = e.getActionCommand(); // 사용자가 선택한 메뉴아이템을 리턴
			if(n.equals("새로 만들기")) {
				jb.setText(n+"를 선택");
			}else if(n.equals("새 창")) {
				jb.setText(n+"를 선택");
				c.setBackground(null);
			}else if(n.equals("배경색")) {
				c.setBackground(Color.pink);
			}
		}
	}
	
	public static void main(String[] args) {
		new SwingEvent2();
	}

}
