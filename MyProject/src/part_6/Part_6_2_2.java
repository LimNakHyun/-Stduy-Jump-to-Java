package part_6;

import java.io.FileWriter;
import java.io.IOException;

// 특정 위치에 FileWriter를 사용하여 자료를 입력한 텍스트 파일을 만드는 코드

public class Part_6_2_2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\admin\\eclipse-workspace\\MyProject\\out2.txt");
		for (int i = 1; i < 11; i++) {
			String data = i+" 번째 줄입니다.\r\n";
			fw.write(data);
		}
		String data = "\r\nFileWriter로 만들어낸 텍스트 파일 입니다.\r\n";
		fw.write(data);
		fw.close();
	}
}
