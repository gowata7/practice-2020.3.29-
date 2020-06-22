
public class MultiThread2 implements Runnable{
	String name;
	MultiThread2(String name){
		this.name=name;
	}
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(name+"¸ÀÀÖ´Ù");
		}
	}
	public static void main(String[] args) {
		MultiThread2 t1 = new MultiThread2("»ç°ú");
		Thread th1 = new Thread(t1);
		th1.start();
		MultiThread2 t2 = new MultiThread2("¿À·»Áö");
		Thread th2 = new Thread(t2);
		th2.start();
	}

}
