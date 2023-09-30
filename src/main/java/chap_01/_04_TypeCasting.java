package chap_01;

public class _04_TypeCasting {
    public static void main(String[] args) {
        // TypeCasting : 형변환
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 92;
        System.out.println(score); // 92
        System.out.println((float) score); // 92.0
        System.out.println((double) score); // 92.0

        // float, double to int
        float score_f = 92.13F;
        double score_d = 98.9;
        System.out.println((int) score_f); // 92
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 92.8;
        System.out.println(score); // 185

        score_d = (double) 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 185 -> 185.0
        System.out.println(convertedScoreDouble);
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        System.out.println(convertedScoreInt);
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); // 문자열 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // 문자열 98.8

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); // 93

        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8
    }
}
