package part_6;

import java.io.FileInputStream;
import java.io.IOException;

// FileInputStream을 사용하여 텍스트 파일을 byte배열로 읽어온 후 String으로 바꿔서 출력하였다.

public class Part_6_2_6 {
	public static void main(String[] args) throws IOException {
		byte[] b = new byte[10];
		FileInputStream input = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\MyProject\\test.txt");
		input.read(b);
		System.out.println(new String(b));
		input.close();
	}
}
