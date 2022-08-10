package part_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Question_6_5_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\admin\\eclipse-workspace\\MyProject\\prob_6_5.txt"));
		
		String result = "";
		
		while(true) {
			String line = br.readLine();
			if(line==null) {
				break;
			}else {
//				System.out.println(line.getClass().getName());
				String data = line.replaceAll("python", "java");
//				System.out.println(data);
				result += data+"\n";
			}
		}
		
		br.close();
//		System.out.println(result);
		PrintWriter pw = new PrintWriter("C:\\Users\\admin\\eclipse-workspace\\MyProject\\prob_6_5.txt");
		pw.print(result);
		pw.close();
	}
}
