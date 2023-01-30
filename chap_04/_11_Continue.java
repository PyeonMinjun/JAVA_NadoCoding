package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번이 노쇼
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 노쇼라면 ?
            if (i == noShow){
                System.out.println(i +"번 손님, 대기시간초과로 상품취소처리되었습니다.");
                continue;
            }
            sold ++; //판매처리
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;

            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("##################");
        // While 문
        sold = 0;
        int index = 0; // 손님 번호
//        while (index <= 50){
        while (true){
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index == noShow){
                System.out.println(index +"번 손님 대기시관초과로 상품취소되었습니다.");
//                index++;
                continue;
            }
            sold ++;
            if (sold == max){
                System.out.println("금일 재료 소진");
                break;
            }
//           index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
