package Java_JeongSeok_Basic.Ch3.Example;

// 15. 논리 연산자의 활용
// Scanner를 활용하여 사용자로부터 하나의 문자를 입력받고, 해당 문자가 숫자인지 영문자인지 확인하는 예제.

import java.util.Scanner;

public class Ex03_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자 하나를 입력하세요.>");

        String input = sc.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9') {            // 입력값이 문자인지 확인.
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }

        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {      // 입력값이 영문(소문자or대문자 불문)인지 확인.
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }
    }
}
