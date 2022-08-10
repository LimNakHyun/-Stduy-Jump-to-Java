package part_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// BufferedReader와 그 안의 readLine 메소드를 사용하여 텍스트파일을 읽어오기

public class Part_6_2_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\admin\\eclipse-workspace\\MyProject\\test.txt"));
		while(true) {
			String line = br.readLine();
			if (line==null) break;
			System.out.println(line);
		}
		br.close();
	}
}
