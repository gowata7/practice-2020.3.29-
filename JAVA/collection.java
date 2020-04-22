import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class VectTest1 {
	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList();
		a.add("한성희");
		a.add("오민우");
		a.add("김범준");
		a.add("김현수");
		a.add("anyone");
		
		Iterator <String> it = a.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.print(k + " ");
		}
		System.out.println();
		Collections.sort(a); // 오름차순
		System.out.println(a);
		//Collections.reverse(a); // 내림차순
		//System.out.println(a);
		int x = Collections.binarySearch(a, "김범준")+1;
		System.out.println(x+"번 째");
	}
}
