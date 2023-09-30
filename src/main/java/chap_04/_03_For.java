package chap_04;

public class _03_For {
    public static void main(String[] args) {
        // 반목문 for
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "번째 반복");
        }

        // 단축키 : fori 만 적고 엔터
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        // NestedLoop (이중 반복문)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i < 10; i++) {
            System.out.println("-----" + i + "단-----");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
