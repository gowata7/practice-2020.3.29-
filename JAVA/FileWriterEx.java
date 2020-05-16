package day20200428;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\Users\\1-705-7\\Desktop\\test.txt");
			while(true) {
				String ln = sc.nextLine();
				if(ln.length()==0) {
					break;
				}
				fw.write(ln, 0, ln.length());
				fw.write("\r\n", 0,2); // 한 줄 띄우기 위해서
			}
			fw.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}

}
