package Java_JeongSeok_Basic.Ch2.Example;

// 17. 타입 간의 변환방법

public class Ex2_12 {
    public static void main(String[] args) {
        String str = "3";

        System.out.println(str.charAt(0) - '0');             // 문자열 "3"을 문자 '3'으로 변환하고, 다시 문자'3'을 숫자3으로 변환
        System.out.println('3' - '0' + 1);                   // 문자를 숫자로 변환하고, 덧셈 연산 수행.
        System.out.println(Integer.parseInt("3") + 1);    // 문자열 "3"을 정수로 변환하고, 덧셈 연산 수행.
        System.out.println("3" + 1);                         // 문자열 + 숫자 => 문자열 + 문자열 -> 문자열 간 결합.
        System.out.println((char)(3 + '0'));                 // 숫자를 문자로 변환
    }
}
