package part_6;

import java.util.Scanner;

public class Question_6_2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String a = sc.nextLine();
			a = a.toUpperCase();
			
			if ("END".equals(a)) {
				break;
			}
			
			System.out.println(a);
		}
	}
}
