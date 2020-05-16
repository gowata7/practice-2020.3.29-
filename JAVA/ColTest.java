package day20200428;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

public class ColTest {

	public static void main(String[] args) {
		// 1. list(중복허용)
		Vector <Integer> v = new Vector<Integer>();
		v.add(12);
		v.add(45);
		v.add(3);
		v.add(45);
		System.out.println(v);
		v.add(2,100);
		System.out.println(v+"특정 위치: "+v.get(3));
		Collections.max(v); Collections.min(v);
		
		// 2. set(중복허용X)
		HashSet <Double> h = new HashSet<>();
		h.add(1.2);
		h.add(5.9);
		h.add(3.4);
		h.add(5.9);
		System.out.println(h+", "+h.contains(5.9));
		
		int r = (int)(Math.random()*45+1); // 1~45 까지 임의의 수
		
		// 3. map
		HashMap <Integer, String> m = new HashMap<>();
		m.put(1, "보안");
		m.put(2, "애동");
		m.put(3, "컴공");
		System.out.println(m+", "+m.get(2));
	}

}
