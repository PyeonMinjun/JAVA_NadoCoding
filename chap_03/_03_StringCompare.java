package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true , 다르면 false (false)
        System.out.println(s1.equals("Java")); // (true)
        System.out.println(s2.equals("python")); // (false)

        // 대소문자구분없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python")); // (true)

        // 문자열 비교 심화
        // 식당 화장실 예시
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234"; // 같은메모리 공간을 이용함  , 메모리의 값을 s1, s2가 "참조"함


        System.out.println(s1.equals(s2)); // (true)
        System.out.println(s1 == s2); // (true)

        s1 = new String("1234");
        s2 = new String("1234");
        // new 연산자 : 서로 다른 위치의 메모리 주소를 가짐

        System.out.println(s1.equals(s2)); // (true) equals는 "내용" 비교
        System.out.println(s1 == s2); // (false) == 등호는 "참조" 가 같은지를 비교

        // 내용을 비교하기 위해서는 등호보다 equals를 사용하자
    }
}
