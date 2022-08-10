package part_5;

class Calculator {
    Integer value;

    Calculator() { // 생성자가 없다면 Integer값에 Null이 기본적으로 들어가 버리기 때문에 NullPointerException 오류가 발생한다.
        this.value = 0;
    }
    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

public class Prob_5_6 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(3);
        System.out.println(cal.getValue());
    }
}
