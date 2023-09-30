package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 10;
        boolean morningCoffee = false;

        if (hour < 14 && morningCoffee == false) {
            System.out.println("아이스 아메리카노");
        }

        hour = 15;
        if (hour < 14 && morningCoffee == false) {
            System.out.println("아이스 아메리카노 + 1");
        } else {
            System.out.println("아이스 아메리카노 디카페인");
        }

        boolean hallabongAde = false;
        boolean mangoJuice = true;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 + 1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 + 1");
        } else {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("주문 완료");
    }
}
