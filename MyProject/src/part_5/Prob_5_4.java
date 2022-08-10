package part_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob_5_4 {
    public static void main(String[] args) {
        계산기 칼크 = new 계산기();

//        double[] 배열 = {1, 3, 5, 7, 9};
//        double result = 0;
//
//        result = 칼크.평균(배열);
//        System.out.println(result);

        ArrayList<Double> 리스트 = new ArrayList<Double>(Arrays.asList(1.0,2.0,7.0));
        double result = 0;

        result = 칼크.평균(리스트);
        System.out.println(result);
    }
}
