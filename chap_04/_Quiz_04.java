package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차 요금 정산 프로그램
//        int generalcar = 5;
//        int smallcar = 5;
//        int disabled = 15;
//        int fee = 4000;
//
//        for (int i = 0; i < 1; i++) {
//            if (fee * generalcar <= 30000) {
//                System.out.println("일반 차량 " + generalcar + "시간 주차 시 " + fee * generalcar);
//            } else {
//                System.out.println("일반 차량 " + generalcar + "시간 주차 시 " + 30000);
//            }
//            if ((fee * smallcar) / 2 <= 30000) {
//                System.out.println("경차 " + smallcar + "시간 주차 시 " + (fee * smallcar) / 2);
//            } else {
//                System.out.println("경차 " + smallcar + "시간 주차 시 " + 30000);
//            }
//            if ((fee * disabled) <= 30000) {
//                System.out.println("장애인차량 " + disabled + "시간 주차 시 " + (fee * disabled) / 2);
//            } else if ((fee * disabled) / 2 <= 30000) {
//                System.out.println("장애인차량 " + disabled + "시간 주차 시 " + 30000 / 2);
//            }
//        }
//    }
        int hour = 10;
        boolean issmallcar = false; // 경차 여부
        boolean isdisabled = true; // 장애인 차량 여부
        int fee = hour * 4000;

        if (fee > 30000){
            fee = 30000;
        }

        if (issmallcar || isdisabled){
            fee /= 2;
        }

        System.out.println("주차 요금은" + fee+ "원입니다.");







    }
}