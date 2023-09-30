package chap_06;

public class _02_Overloading {
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 파라미터의 타입이 다르거나
        // 2. 파라미터의 갯수가 다르거나
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(2, 3));
    }

    /*
    * 파라미터의 타입이 다르거나 파라미터의 개수가 다르면 메소드 오버로딩 가능
    * */

    public static int getPower(int num) {
        return num * num;
    }

    // 파라미터의 타입이 다른 메소드를 중복해서 선언할 수 있다.
    public static int getPower(String strNum) {
        int number = Integer.parseInt(strNum);
        return number * number;
    }

    public static int getPower(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }

        return result;
    }
}
