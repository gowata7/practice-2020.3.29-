package day20200428;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null; // null은 초기값
		try {
			fin = new FileReader("test.txt");
			int c;
			while((c=fin.read()) != -1) { // -1은 문자의 끝을 의미
				 System.out.print((char) c);
				 // 한글이 깨져서 나올 경우 Run Configuration -> common -> encoding 방식을 UTF-8로 설정
			}
		
		fin.close();
		} catch(IOException e) {
		System.out.println("입출력 오류");
	}

}
}
