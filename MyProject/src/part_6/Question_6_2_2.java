package part_6;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Question_6_2_2 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		
		while (true) {
			String a = br.readLine();
			
			if ("END".equals(a)) {
				break;
			}
			
			a = a.toUpperCase();
			System.out.println(a);
		}
	}
}
