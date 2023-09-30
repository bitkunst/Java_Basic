package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {

        // 다차원 배열 순회
        String[][] seats = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        // ASCII 코드 (ANSI)
        // 알파벳 대문자(A)는 65부터 시작, 소문자(a)는 97부터 시작, 숫자(0)는 48부터 시작
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);
    }
}
