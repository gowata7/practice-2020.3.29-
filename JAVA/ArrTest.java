import java.util.ArrayList;
import java.util.Iterator;

// 중간고사 출제
class Person{
	private String name;
	private int age;
	private String address;
	
	public Person(String string, int i, String string2) { // 생성자는 클래스 이름과 같다.
		this.name=string; this.age=i; this.address=string;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getAddress() {
		return address;
	}
}

public class ArrTest {
	public static void main(String[] args) {
		ArrayList <Person> ar = new ArrayList<>();
		ar.add(new Person("경표", 53, "서울시"));
		ar.add(new Person("승준", 23, "용산구"));
		ar.add(new Person("준호", 11, "제주시"));
		
		Iterator <Person> it = ar.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName()+","+p.getAge()+","+p.getAddress());
		}
	}

}
