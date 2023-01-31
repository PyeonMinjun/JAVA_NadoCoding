package chap_06;

public class _09_MainMethod {
    public static void main(String[] args) {
//        메인메소드는 문자열을 여러개 가지고있는 String 배열을 전달값으로 받는 메소드다.
        for (String s : args) {
            System.out.println(s);
            /*   테스트
                 전달값
                 입니다*/
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if (args.length == 1 ){
            switch (args[0]){
                case "1":
                    System.out.println("도서조회 메뉴입니다");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴");
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }else {
            System.out.println("사용법) 1~3 메뉴 중 하나를 입력하세요. ");
        }
    }
}
