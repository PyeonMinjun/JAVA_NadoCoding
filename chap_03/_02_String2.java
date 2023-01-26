package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and",","));  //  " and"를 "," 로 변환  (I like Java, Python, C.)
        System.out.println(s.substring(7)); // 인덱스 기준 7 부터 시작 (이전 내용은 삭제)   (Java and Python and C)
        // s 변수에 반환되는것이 아님
        // 반환을 하고싶으면
        // s = s.substring(7);

        System.out.println(s.substring(s.indexOf("Java"))); // Java and Python and C.
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작 위치부터 끝 위치 "직전" (Java and Python and C)

        // 공백 제거
        s = "        I love Java.        ";
        System.out.println(s);
        System.out.println(s.trim()); // 공백 제거  (I love Java.)

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2)); // (Java,Python)

    }
}

