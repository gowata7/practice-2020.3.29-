import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashExp {

	public static void main(String[] args) {
		HashMap <String, Integer> m = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		m.put("범죄", 112);
		m.put("구급차", 119); // 밑에 소스의 key값이 중복되어 출력되지 않는 모습이다.
		m.put("전화번호안내", 114);
		m.put("코로나", 1339);
		m.put("마약신고", 1301);
		
		Set<String> keys = m.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.print("검색할 전화번호는?");
		String name = sc.next();
		if(it.hasNext()) {
			int b = m.get(name);
			System.out.println(name+"는 "+b);
		}
		
		
		/*
		while(it.hasNext()) {
			String a = it.next();
			int b = m.get(a);
			System.out.println(a+"는 "+b);
		}
		*/
		
		
	}

}
