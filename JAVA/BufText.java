package day20200428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufText {
	public static void main(String[] args) throws IOException { // 예외처리만 떤져줌, 이거 써주면 try,catch 안해줘도 됨
		//InputStreamReader in = new InputStreamReader(System.in);\
		//BufferedReader br = new BufferedReader(in);
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("자료 입력: ");
		String s = b.readLine();
		System.out.println(s);
		
	}

}
