package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 정수 연산의 결과는 정수
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0

        // 나머지 연산
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // 대입 연산자
        int num = 10;
        num += 2;
        System.out.println(num);

        // 논리 연산자
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 || b2 || b3); // true
        System.out.println(b1 && b2 && b3); // false

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true

    }
}
