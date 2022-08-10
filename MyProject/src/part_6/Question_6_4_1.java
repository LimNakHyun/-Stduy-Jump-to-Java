package part_6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question_6_4_1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:\\Users\\admin\\eclipse-workspace\\MyProject\\Sameple.txt", true);
		String data = sc.nextLine();
		fw.write(data+"\r\n");
		fw.close();
	}
}
