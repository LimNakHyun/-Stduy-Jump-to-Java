package part_6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_6_4_2 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\admin\\eclipse-workspace\\MyProject\\Sameple.txt", true));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a sentence: ");
		
		String line = sc.nextLine();
		pw.println(line);
		pw.close();
	}
}
