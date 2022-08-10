package part_5;

public class Prob_5_2_최대한정계산기 extends 계산기 {
    //int 결괏값() {
    //  if (this.값 > 100) {
    //    return this.값 = 100;
    //  } else {
    //    return this.값;
    //  }
    //}
    void 덧셈(int 더할숫자) {
        this.값 += 더할숫자;
        if (this.값 > 100) {
            this.값 = 100;
        }
    }
}
