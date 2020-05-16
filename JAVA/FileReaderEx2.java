package day20200428;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx2 {

	public static void main(String[] args) {
		File sc = new File("C:\\Users\\1-705-7\\Desktop\\name.txt"); // 원본 파일 경로명
		File ds = new File("C:\\Users\\1-705-7\\Desktop\\NEW.txt"); // 복사 파일 경로명(내용은 그대로 하고 다른 이름으로 저장할 곳)
		
		try {
			FileReader fin = new FileReader(sc);
			FileWriter fw = new FileWriter(ds);
			int c;
			System.out.println("<원본 내용>");
			while((c=fin.read()) != -1) { // -1은 문자의 끝을 의미, 문자 하나를 읽고
				System.out.print((char) c);
				fw.write((char) c); // 문자 하나를 쓴다.
				 // 한글이 깨져서 나올 경우 Run Configuration -> common -> encoding 방식을 UTF-8로 설정
			}
		fin.close(); fw.close();
		System.out.println(sc.getPath()+"를 "+ds.getPath()+"로 복사했습니다.");
		} catch(IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
