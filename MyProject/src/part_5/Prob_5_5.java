package part_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob_5_5 {
    public static void main(String[] args) {
//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
//        ArrayList<Integer> b = a;
//        a.add(4);
//        System.out.println(b.size());
//        System.out.println(a==b);

        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> b = new ArrayList<Integer>(a);
        a.add(4);
        System.out.println(b.size());
        System.out.println(a==b);
    }
}
