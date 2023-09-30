package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참인 경우 결과값) : (거짓인 경우 결과값)
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);
    }
}
