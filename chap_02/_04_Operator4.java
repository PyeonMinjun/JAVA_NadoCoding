package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 3개중에서 하나라도 true 이면 true (괜찮은 식당)
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 true


//      and 연산
        System.out.println((5 > 3) && (3> 1)); // true
        System.out.println((5 > 3) && (3 < 1)); // false

//       or 연산
        System.out.println((5 > 3) && (3> 1)); // true
        System.out.println((5 > 3) && (3 < 1)); // true


//        논리부정연산자
        System.out.println(!true); // false
        System.out.println(!(5 == 5)); // false




    }
}
