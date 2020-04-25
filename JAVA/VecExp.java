import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/* Vector에 이름을 입력받아 저장
1. 회원입력
2. 회원출력
3. 회원조회
4. 종료
*/

public class VecExp {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Vector <String> v = new Vector<String>();
		Scanner sc = new Scanner(System.in);

		while(true) {
		System.out.println("1. 회원입력");
		System.out.println("2. 회원출력");
		System.out.println("3. 회원조회");
		System.out.println("4. 종료");
		System.out.println();
		System.out.print("번호를 입력하십시오: ");
		int x = sc.nextInt();
		
		if(x==1) {
			System.out.println("회원 입력 하시다가 끝내고싶으면 x를 누르십시오");
			while(true) {	
				System.out.print("회원 이름을 입력하십시오: ");
				String name = sc.next();
				v.add(name);
				if(name.equals("x")) {
					v.remove("x");
					break;
				}
			}
		}else if(x==2) {
			System.out.println("회원을 출력합니다..");
			System.out.println(v+" ");
			break;
		}else if(x==3) {
			System.out.println("조회할 이름은?");
			String s_name = sc.next();
			int k1 = Collections.binarySearch(v,s_name)+1;
			Collections.sort(v); // 밑에 k1을 조건으로 걸 경우 무조건 sort 해줘야 한다.
			
			if(k1>0) {
				System.out.println(s_name+"는 "+k1+"번째에 존재합니다.");
			}
			else{
				System.out.println(s_name + "는 존재하지 않습니다.");
			}
		}
	
		else if(x==4) {
			System.out.println("프로그램을 종료합니다");
			break;
		}else {
			System.out.println("잘못된 입력값입니다.");
		}
	}
		sc.close();
		
	}
}
