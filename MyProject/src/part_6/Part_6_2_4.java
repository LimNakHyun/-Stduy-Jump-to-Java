package part_6;

import java.io.FileWriter;
import java.io.IOException;

// FileWriter를 사용하여 파일에 내용 추가하기

public class Part_6_2_4 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\admin\\eclipse-workspace\\MyProject\\out4.txt");
		for (int i=1; i<11; i++) {
			String data = i+" 번째 줄입니다.\r\n";
			fw.write(data);
		}
		fw.close();
		
		FileWriter fw2 = new FileWriter("C:\\Users\\admin\\eclipse-workspace\\MyProject\\out4.txt", true);
		for (int i=11; i<21; i++) {
			String data = i+" 번째 줄입니다.\r\n";
			fw2.write(data);
		}
		String data = "\nFileWriter를 사용하여 만들어진 파일입니다.\r\n";
		fw2.write(data);
		fw2.close();
	}
}
