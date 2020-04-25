import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashTest {

	public static void main(String[] args) {
		HashSet <Integer> h = new HashSet<>();

		h.add(5);
		h.add(3);
		h.add(7);
		h.add(5);
		System.out.println(h);
		
		HashMap <Integer,String> m = new HashMap<>(); //key, value
		// key는 중복x, value가 중복됨!!
		m.put(3, "승표");
		m.put(2, "규용"); // 밑에 소스의 key값이 중복되어 출력되지 않는 모습이다.
		m.put(2, "준호");
		System.out.println(m+"size="+m.size());
		
		Set <Integer> keys = m.keySet();
		Iterator <Integer> it = keys.iterator();
		
		while(it.hasNext()) {
			int a = it.next();
			String b = m.get(a);
			System.out.println(a+", "+b);
		}
	}

}
