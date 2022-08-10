package part_6;

import java.io.FileOutputStream;
import java.io.IOException;

// 특정 위치에 FileOutStream을 사용하여 자료를 입력한 텍스트 파일을 만드는 코드

public class Part_6_2_1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\admin\\eclipse-workspace\\MyProject\\out1.txt");
		for (int i = 1; i < 11; i++) {
			String data = i+" 번째 줄입니다.\r\n";
			output.write(data.getBytes());
		}
		String data = "\r\nFileOutputStream으로 만들어 낸 텍스트파일 입니다.\r\n";
		output.write(data.getBytes());
		output.close();
	}
}
