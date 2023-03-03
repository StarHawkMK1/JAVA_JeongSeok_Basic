package Java_JeongSeok_Basic.Ch2.Example;

// 14. Scanner클래스의 활용 (화면으로부터 입력받기)

import java.util.Scanner;           // Scanner클래스를 사용하기 위해 추가.

public class Ex2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // Scanner클래스를 사용하기 위해 객체를 생성

        System.out.print("두 자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine();          // 입력한 값을 string타입 변수 input에 저장
        int num = Integer.parseInt(input);          // 입력받은 문자열을 숫자로 변환

        System.out.println("입력내용: " + input);
        System.out.printf("num = %d%n", num);
    }
}