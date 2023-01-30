package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {

        int shoose[] = new int[10];
        for (int i = 0; i < 10; i++) {
            shoose[i] = 250 + (5 * i);
        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("사이즈 "+shoose[i]+" (재고 있음)");
//        }

        //for each 사용

        for (int size1 :
                shoose) {
            System.out.println("사이즈 " + size1 + " (재고 있음)");
        }


    }
}
