package chap_04;

public class _09_MulitpleTable {
    public static void main(String[] args) {
        // 구구단
        // 2 * 1 = 2
        // 2 * 2 = 4
        // 2 * 3 = 6

        // 3....

        // 9 * 9 = 81
        for (int i = 2; i < 10 ; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i+ "*" +j +"="+ i*j);
            }

        }
    }
}
