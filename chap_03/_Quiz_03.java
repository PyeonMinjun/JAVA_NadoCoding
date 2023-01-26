package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String case1 = "901231-1234567";
        String case2 = "030708-4567890";

        System.out.println(case1.substring(0,8));
        System.out.println(case2.substring(0,8));
        System.out.println(case1.substring(0,case1.indexOf("-") + 2));

    }
}
