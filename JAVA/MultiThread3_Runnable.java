import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MultiThread3_Runnable extends JFrame implements Runnable, ActionListener{
	JLabel jl = new JLabel("0");
	JButton jb = new JButton("START");
	JButton jb2 = new JButton("STOP");
	Thread th;
	int x = 0;
	MultiThread3_Runnable(){
		setSize(500,500);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(jl);
		jl.setFont(new Font("궁서",Font.BOLD,100));
		jl.setForeground(Color.GREEN);
		jb.addActionListener(this);
		c.add(jb);
		jb2.addActionListener(this);
		c.add(jb2);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void run() {

			try {
				while(true) {
					System.out.println(x+ "번 째 쓰레드");
					jl.setText(Integer.toString(x));
					x++;
					
					if(x==10) {
						jl.setForeground(Color.RED);
						jl.setText("BOOM");
						break;
					}
				Thread.sleep(1000);
				}
			}catch(InterruptedException e) {

			}
		}	
	
	public static void main(String[] args) {
		MultiThread3_Runnable mr = new MultiThread3_Runnable();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jb))
		{
			jl.setForeground(Color.GREEN);
			th = new Thread(this);
			th.start();
		}else {
			jl.setForeground(Color.red);
			jl.setText(x+"(STOP)");
			th.interrupt();
		}
	}

	

}
