import java.util.Scanner;
import java.util.Stack;

/* 홈페이지의 앞으로,뒤로가기 기능과 원리가 같다.
 * 1. 스택1에 추가
 * 2. [뒤로]: 스택1의 자료를 스택2에 넣기
 * 3. [앞으로]: 스택2의 자료를 스택1에 넣기
 * 4. 스택1과 스택2를 보여라.
 */

public class StackExp {
	static Stack <String> s1 = new Stack<String>();
	static Stack <String> s2 = new Stack<String>();
	
	static void goPush(String n) {
		s1.push(n);
	}
	static void goBack() {
		s2.push(s1.pop());
	}
	static void goFront() {
		s1.push(s2.pop());
	}
	static void print() {
		System.out.println(s1);
		System.out.println(s2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		goPush("다음"); goPush("네이버"); goPush("야후"); goPush("라이코스");
		
		while(true) {
		System.out.println("1:뒤로가기, 2:앞으로가기, 3:현재위치, 4:종료");
		System.out.print("번호를 입력하십시오: ");
		int x = sc.nextInt();
		if(x==1) {
			goBack();
		}else if(x==2) {
			goFront();
		}else if(x==3) {
			System.out.println("s1 현재 위치: "+s1.peek());
			System.out.println("s2 현재 위치: "+s2.peek());
		}else if(x==4){
			System.out.println("종료합니다.");
		}else {
			System.out.println("잘못된 번호입니다.");
		}
		print();
		//뒤로가기
		//s1.pop();
		//s2.push();
		//앞으로가기
		//s2.pop();
		//s1.push();
		sc.close();
	}
}
}
