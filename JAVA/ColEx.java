package day20200428;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ColEx {

	public static void main(String[] args) {
		HashSet <Integer> h = new HashSet <>();
		
		while(h.size()<6) {
			h.add((int)(Math.random()*45+1));
		}

		List <Integer> ls = new LinkedList<Integer>(h);
		Collections.sort(ls);
		System.out.println(ls);
	}

}
