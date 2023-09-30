package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and TS and Solidity.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 32

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("JS")); // false

        // 인덱스
        System.out.println(s.indexOf("Java")); // 시작 인덱스 7
        System.out.println(s.indexOf("JS")); // 포함되지 않는다면 -1
        System.out.println(s.indexOf("and")); // 처음 일치하는 인덱스 정보 (12)
        System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 인덱스 정보 (19)
        System.out.println(s.startsWith("I like")); // true
        System.out.println(s.endsWith(".")); // true
    }
}
