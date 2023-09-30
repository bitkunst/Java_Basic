package chap_01;

public class _02_Variables {
    public static void main(String[] args) {
        // String -> 문자열
        String name = "bitkunst";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");

        double score = 90.5;
        char grade = 'A'; // 한 글자만 표현할 때는 char, single quote 사용
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        // double 과 float 모두 부동 소수점 표현
        double d = 3.14123456789; // 64 bit 부동 소수점
        float f = 3.14123456789F; // 32 bit 부동 소수점
        System.out.println(d);
        System.out.println(f);

        // 정수를 표현하기 위한 int 와 long
        int i = 2100000000; // int는 약 21억까지
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

        /*
        * 한 줄 주석 : Ctrl + /
        * 여러 줄 주석 : Ctrl + Shift + /
        * */

        // 상수 - 대문자로 표기
        final String CODE = "KR"; // 상수에는 final 이라는 예약어를 붙인다.

    }
}
