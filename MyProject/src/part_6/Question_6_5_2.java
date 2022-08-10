package part_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Question_6_5_2 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> data = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\admin\\eclipse-workspace\\MyProject\\prob_6_5.txt"));
		
		while(true) {
			String line = br.readLine();
			if (line==null) break;
			data.add(line);
			
			System.out.println(line);
		}
		br.close();
		System.out.println(data);
		
		String text = String.join("\n",data);
		
		text = text.replaceAll("python","java");
		System.out.println(text);
		
		FileWriter fw = new FileWriter("C:\\Users\\admin\\eclipse-workspace\\MyProject\\prob_6_5.txt");
		fw.write(text);
		fw.close();
	}
}
