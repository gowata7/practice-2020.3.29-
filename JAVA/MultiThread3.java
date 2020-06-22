import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MultiThread3 extends JFrame{
	JLabel jl = new JLabel("1");
	MultiThread3(){
		setSize(500,500);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(jl);
		jl.setFont(new Font("궁서",Font.BOLD,100));
		jl.setForeground(Color.GREEN);
		MyThread th = new MyThread();
		th.start();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	class MyThread extends Thread{
		int x = 1;
		public void run() {
			while(true) {
				System.out.println(x+ "번 째 쓰레드");
				jl.setText(Integer.toString(x));
				x++;
				if(x==20) {
					jl.setForeground(Color.RED);
					jl.setText("BOOM");
					break;
				}
				try {
					Thread.sleep(250);
				}catch(InterruptedException e) {
					System.exit(0);
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		new MultiThread3();
	}

}
