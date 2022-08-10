package part_5;

import java.util.ArrayList;

public class 계산기{
    int 값;

    계산기() {
        this.값 = 0;
    }

    void 덧셈(int 더할숫자) {
        this.값 += 더할숫자;
    }

    int 결괏값() {
        return this.값;
    }

//    boolean 홀짝판별() {
//        if (this.값 % 2 == 0) {
//            return false;
//        } else {
//            return true;
//        }
//    }

    boolean 홀짝판별(int 판별숫자) {
        return 판별숫자 % 2 == 1;
    }

    double 평균(double[] 배열) {
        double result = 0;
        for (double 숫자: 배열) {
            result += 숫자;
        }
        return result/배열.length;
    }

    double 평균(ArrayList<Double> 리스트) {
        double result = 0;
        for (double 숫자: 리스트) {
            result += 숫자;
        }
        return result/리스트.size();
    }
}
