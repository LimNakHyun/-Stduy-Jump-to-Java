package part_6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// PrintWriter를 사용하여 파일에 내용 추가하기

public class Part_6_2_5 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("C:\\Users\\admin\\eclipse-workspace\\MyProject\\out5.txt");
		for (int i=1; i<11; i++) {
			String data = i+" 번째 줄입니다.";
			pw.println(data);
		}
		pw.close();
		
		PrintWriter pw2 = new PrintWriter(new FileWriter("C:\\Users\\admin\\eclipse-workspace\\MyProject\\out5.txt", true));
		for (int i=11; i<21; i++) {
			String data = i+" 번째 줄입니다.";
			pw2.println(data);
		}
		String data = "\nPrintWriter를 사용해 만들어진 파일입니다.";
		pw2.println(data);
		pw2.close();
	}
}
