package chap_06;

public class _04_ParmeterAndReturn {


    public static int getPower(int num){
        int result = num * num;
        return result;
        //return num * num;
    }
    public static int getPowerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }


    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int retVal = getPower(2);
        System.out.println(retVal);

        retVal = getPowerByExp(3,3);
        System.out.println(retVal); // 3 * 3 * 3

        //System.out.println(getPowerByExp(3,3)); 이렇게도 해도됨

    }
}
