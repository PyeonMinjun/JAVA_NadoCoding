package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
//      형변환 TypeCasting
//      정수형에서 실수형으로
//        실수형에서 정수형으로


//      int score =93 + 98.8;   //실수형데이터 int형으로 계산할려해서 에러

        // int형 --> float double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float) score); //93.0
        System.out.println((double) score); //93.0

        //flaot, double --> int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score); //191

        score_d = (double) 93 + 98.8; //에러가안나는이유는 정수와 실수 계산이
                                        // 실수로 들어갈때는 자동형변환 (double) 생략해도됌
                                        // 93.0 + 98.8
        System.out.println(score_d);   // 191.8


        //변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환) 커질때 자동으로 형 변환이됌 , 자료형을 붙이지않아도됨

        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)


//        -------------------------------------------------------------------------------------------------------------
//         후반전



//        숫자를 문자열로
//        String클래스의 valueOf로 93정수를 문자로 바꿈
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);  //동일기능 숫자를 문자열로
        System.out.println(s1); // 93

//          실수형 ->  문자열
        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); //98.8


//        문자열 -> 숫자로
        int i = Integer.parseInt("93"); // : 파싱한다
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

//      괄호속에 데이터가 잘못들어간다면 error 발생
        int error = Integer.parseInt("자바");






    }
}
