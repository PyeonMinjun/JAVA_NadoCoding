package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "편민준님";
//        name = "편민준님,";
//          똑같은 동작
        int hour = 15;

        System.out.println(name + " 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + " 배송이 완료되었습니다.");

        double score = 90.5; //정밀 실수
        char grade = 'A';
        name = "강호동"; // 값 업데이트

        System.out.println(name+ "님의 평균점수는 " + score + "점입니다. ");
        System.out.println("학점은" + grade +"입니다.");

        boolean pass = true; //false 가능
        System.out.println("이번 시험에 합격했을까요?" + pass);


        double d = 3.14123124214;  //정밀
        float f = 3.14123124124F;   //비정밀 소수점 6개까지 표현함
        System.out.println(d);
        System.out.println(f);

        //int i =1000000000000; //int 자료형 범위를 벗어남
        long l = 1000000000000L;
        l =1_000_000_000_000L; //눈으로 보기편하게 3칸씩 언더바   /  표현은 그대로
        System.out.println(l);


    }
}
