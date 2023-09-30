package chap_04;

public class _04_While {
    public static void main(String[] args) {
        // 반복문 while
        int distance = 25;
        int move = 0;

        while (move < distance) {
            System.out.println("run!");
            System.out.println("이동 거리 : " + move);
            move += 3;
        }
        System.out.println("arrive!");
    }
}
