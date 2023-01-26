package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Spcial Charcter)
        // \n \t \\ \" \'

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        //  \n: 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");


        // \t : 탭
        // 해물파전     9000원
        // 김치전      8000원
        // 부추전      8000원
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java"); // \P \J는 약속된게없다. (C:\Program Files\Java)

        //  \" : 큰따옴표
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"나옹\"이라고 했어요"); // 앞뒤로 큰따옴표로 문장을 씀 냐옹이라는 이상한글자가 삽입된거.
        // (단비가 "나옹"이라고 했어요)

        // \' : 작은따옴표
        System.out.println("단비가 \'뭘 봐?\' ");
        System.out.println("단비가 '뭘 봐?' ");

        // 작은따옴표는 char에다가 넣을때 사용
        char c = 'A';
        c = '\'';
        System.out.println(c); //(')
    }
}
