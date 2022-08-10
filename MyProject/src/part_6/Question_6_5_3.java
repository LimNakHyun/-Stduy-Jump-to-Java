package part_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Question_6_5_3 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\admin\\eclipse-workspace\\MyProject\\prob_6_5.txt"));
		
		while(true) {
			String line = br.readLine();
			if (line==null) break;
			al.add(line);
		}
		br.close();
		
//		System.out.println(al);
		
		String text = String.join("\n", al);
//		System.out.println(text);
		
		text = text.replaceAll("python", "java");
		System.out.println(text);
		
		FileWriter fw = new FileWriter("C:\\Users\\admin\\eclipse-workspace\\MyProject\\prob_6_5.txt");
		fw.write(text);
		fw.close();
	}
}
