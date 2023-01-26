package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
//        변수이름 짓는건 규칙이 있음
//        1.  저장할 값에 어울리는 이름
//        2. 밑줄(_) , 문자(abc) , 숫자(1234) 사용 가능 (공백은 사용불가능)
//        3. 밑줄 또는 문자로 시작가능 / 숫자로 시작 불가능
//        4. 한 단어 또는 2개 이상 단어의 연속
//        5. 소문자로 시작 , 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
//        6. 예약어 사용 불가 (public ,static , void int, double. float, ... )

//        입국 신고서 ( 여행 )
        String nationality = "대한민국";  // 국적
        String firstName =  "현성"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "2001-12-31"; // 생년월일
        String residentialAdress  = "사바나 호텔"; // 체류지
        String perposeOfVisit = "관광"; // 입국 목적
        String flightNo = "KE657"; // 항공 편명
        String _flightNo = "KE657"; // 밑줄 시작
        String flight_no_2 = "KE657"; // 밑줄과 숫자 포함
//        String -flightNo = "KE657" 하이픈은 에러

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        String item1 = "시계";
        String item2 = "가방";
//        String 3item = "전자제품"  // 숫자시작 에러

//        프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 때 변수 간단하게 사용)
        int i = 0;
        String s = "";
        String str = "";

//      절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
//        CODE = "US"  바꿀수없다



    }
}
