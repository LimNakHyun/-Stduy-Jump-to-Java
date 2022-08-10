package part_6;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question_6_1_2 {
  public static void main(String[] args) throws IOException {
    InputStream in = System.in;
    InputStreamReader reader = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(reader);
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    
    System.out.println(a+b);
  }
}
