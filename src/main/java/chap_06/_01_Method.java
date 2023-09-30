package chap_06;

public class _01_Method {

    public static void main(String[] args) {
        helloWorld();
        String contactNumber = getPhoneNumber();
        System.out.println("전화 번호 : " + contactNumber);
    }

    // 반환값이 없는 메소드는 void
    public static void helloWorld() {
        System.out.println("Hello World!");
    }

    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

}
