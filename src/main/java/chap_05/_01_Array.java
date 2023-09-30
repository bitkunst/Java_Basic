package chap_05;

import java.util.Arrays;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        // 배열 선언 #1
        String[] coffees = new String[4];
        // 배열 선언 #2
        String coffees2[] = new String[4];
        // 배열 선언 #3
        String[] coffees3 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
        // 배열 선언 #4
        String[] coffees4 = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 다은 자료형?
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};
    }
}
