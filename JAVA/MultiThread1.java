
public class MultiThread1 extends Thread{
	String name;
	MultiThread1(String name){
		this.name = name;
	}
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(name+"번 째 쓰레드");
		}
	}
	public static void main(String[] args) {
		MultiThread1 t1 = new MultiThread1("1111111");
		t1.start();
		MultiThread1 t2 = new MultiThread1("2222222");
		t2.start();
	}

}
