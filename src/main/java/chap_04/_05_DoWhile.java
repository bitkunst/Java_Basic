package chap_04;

public class _05_DoWhile {
    public static void main(String[] args) {
        // 반복문 do while
        int distance = 25;
        int move = 0;
        int height = 2;

         while (move + height < distance) {
            System.out.println("달리기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }


        // 조건 상관 없이 do 코드블록 먼저 실행
        move = 0;
        height = 25;
        do {
            System.out.println("달리기를 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착");
    }
}
