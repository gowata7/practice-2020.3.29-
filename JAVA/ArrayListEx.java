package day20200428;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
	
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\Users\\1-705-7\\Desktop\\name.txt");
			for(int i=0; i<5; i++) {
				String n = sc.nextLine();
				al.add(n);
				fw.write(al.get(i)+"\n");
			}
			fw.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}
		
}

