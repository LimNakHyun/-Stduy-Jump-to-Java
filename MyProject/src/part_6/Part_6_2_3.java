package part_6;

import java.io.IOException;
import java.io.PrintWriter;

// 특정 위치에 PrintWriter를 이용하여 자료를 입력한 텍스트 파일을 만드는 코드

public class Part_6_2_3 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("C:\\Users\\admin\\eclipse-workspace\\MyProject\\out3.txt");
		for (int i=1; i<11; i++) {
			String data = i+" 번째 줄입니다.";
			pw.println(data);
		}
		String data = "PrintWriter로 만들어 낸 텍스트 파일 입니다.";
		pw.println("\n"+data);
		pw.close();
	}
}
