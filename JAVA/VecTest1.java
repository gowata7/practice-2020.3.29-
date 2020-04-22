import java.util.Iterator;
import java.util.Vector;

public class Hello {

	public static void main(String[] args) {
		Vector <Integer> v1 = new Vector<Integer>(); //정수열
		Vector <Double> v2 = new Vector<Double>(); //실수열
		Vector <String> v3 = new Vector<String>(); //문자열
		Vector <Integer> v4 = new Vector<>();
		Vector v5 = new Vector<>(); // 문자, 정수, 실수 모두 가능
		
		v1.add(5);v2.add(7.8);v3.add("Security");v5.add(45);v5.add("문자");

		v1.add(2);v1.add(31);v1.add(22);v1.add(22);
		System.out.println(v1);
		v1.add(2);v1.add(31);v1.add(22);v1.add(22);
		System.out.println("크기: " +  v1.size() +", 옹량: "+v1.capacity());
		
		//출력
		// get 방식으로 출력하기
		int sum = 0;
		for(int i=0;i<v1.size();i++) {
			int x = v1.get(i);
			sum += x;
		}
		System.out.print("합계:"+sum+" ");
		System.out.println();
		v1.add(1,1234);	// 어느 위치에 무엇을 추가해라
		System.out.println(v1);
		
		// 두 번째 방법: 벡터 안에 있는거 다 찍어라
		for(Integer z:v1) { // 자료형:벡터이름(for each문)
			System.out.print(z+" ");
		}
		System.out.println();
		
		// 세 번째 방법: 벡터 안에 데이터가 있는지 먼저 물어봄
		Iterator <Integer> it = v1.iterator();
		while(it.hasNext()) // 백터에 데이터 있냐?
		{
			int k = it.next();
			System.out.print(k+" ");
		}
	}

}
