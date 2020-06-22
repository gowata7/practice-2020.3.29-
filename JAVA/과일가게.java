import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class 과일가게 extends JFrame{

	Container c;
	JLabel j1;
	JCheckBox j[] = new JCheckBox[3];
	String f[] = {"배","사과","귤"};
	JRadioButton j5, j51, j52;
	JTextField j6;
	
	과일가게() {
		setTitle("과일 가게");
		setSize(500,500);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		ButtonGroup g = new ButtonGroup();
		j5=new JRadioButton("특상");
		j51=new JRadioButton("상");
		j52=new JRadioButton("하");
		g.add(j5);g.add(j51);g.add(j52);
		c.add(j5);c.add(j51);c.add(j52);
	

		MyItemListener listener = new MyItemListener();
		for(int i=0; i<j.length; i++) {
			j[i] = new JCheckBox(f[i]);
			j[i].setBorderPainted(true);
			c.add(j[i]);
		 	j[i].addItemListener(listener);
		}
		
		j6=new JTextField("현재 0원입니다.", 10);
		j6.setBounds(125,150,100,25);
		c.add(j6);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	class MyItemListener implements ItemListener{
		private int sum = 0; // 가격의 합
		public void itemStateChanged(ItemEvent e){
		
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == j[0]) {
					sum += 100;
				}	
				else if(e.getItem()== j[1]) {
					sum += 500;
				}
				else {
					sum += 20000;
				}
			}else{
				if(e.getItem() == j[0])
					sum -= 100;
				else if(e.getItem() == j[1])
					sum -= 500;
				else
					sum -= 20000;
				}
				j6.setText("현재 "+ sum + "원 입니다.");
		}
	}
	class MyItemListener2 implements ItemListener{
		private String str = "";
		public void itemStateChanged(ItemEvent e){
			if(e.getStateChange() == ItemEvent.DESELECTED) {
				return;
				if(j5.isSelected()){
					str += "특상";
				}
				else if(j51.isSelected()){
					str += "상";
				}
				else{
					str += "하";
				}
			j1.setText(str+"을 선택");
			}
		}
	}


	public static void main(String[] args) {
		new 과일가게();
	}
}

