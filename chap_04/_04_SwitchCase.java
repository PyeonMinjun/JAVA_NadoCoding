package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그외 : 장학금 대상 아님

        // if else 는 여러조건 또는 범위에 해당하는 조건
        // Swtich Case는 명확한 케이스가 있는 경우

        // if else 문을 이용
        int ranking = 1; // 1등
        if (ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        }
         else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

         // Swich Case 문을 이용
//        ranking = 1;
        ranking = 2;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금"); //  똑같은 내용이 있다는 의미에서 노란색줄  case 2의 내용을 삭제
                break;

            default:
                System.out.println("장학금 대상아님");
        }
        System.out.println("조회완료 #2");

        //중고상품의 등급에 따른 가격을 책정 (1급 :최상 , 4급 : 최하)
        int grade = 1; // 등급
        int price = 7000; // 기본 가격
        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
            default:
                price += 500;
        }
        System.out.println(grade + "등급 제품의 가격 :" + price + "원");
        // 1등급 제품의 가격 10000원
        // 2등급 제품의 가격 9000원



    }
}
