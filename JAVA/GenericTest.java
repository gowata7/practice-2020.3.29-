package day20200428;

class Test{
	int a;
	void setData(int a) {this.a=a;}
	int getData() {return a;}
}
class Demo<T>{	// 제네릭(여러개의 자료형을 갖고 싶다면?)
	T a;
	void setData(T a) {this.a=a;}
	T getData() {return a;}
}

public class GenericTest {

	public static void main(String[] args) {
		Test t = new Test();
		t.setData(55);
		System.out.println(t.getData());

		Demo<Integer> di = new Demo<>();
		di.setData(78);System.out.println(di.getData());
		Demo<String> ds = new Demo<>();
		ds.setData("보안");System.out.println(ds.getData());
		Demo<Double> dd = new Demo<>();
		dd.setData(7.8);System.out.println(dd.getData());
		
	}

}
