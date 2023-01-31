package chap_06;

public class Parameter {
    public  static void power(int num){ // 파라미터 , 매개변수
        int result = num * num;
        System.out.println(num + "의 제곱은 " + result);
    }

    public static void powerByExp(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        System.out.println(num + "의 " + exponent + "제곱은 " + result);

    }

    public static void main(String[] args) {
        // 전달값 , Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9
        power(3); // 3 * 3 = 9
        powerByExp(2,3);
        powerByExp(10,0);
    }
}
