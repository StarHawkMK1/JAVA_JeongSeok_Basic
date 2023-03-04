package Java_JeongSeok_Basic.Ch4.Example;

// if-else문
// if문의 조건식이 거짓일 때, else블럭 수행.

import java.util.Scanner;

public class Ex04_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 하나 입력하세요.>");
        int input = sc.nextInt();          // 사용자로부터 입력받은 값을 변수 input에 저장

        if (input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");       // 입력받은 값이 0인 경우 출력되는 문장
        } else {    // input != 0 인 경우
            System.out.println("입력하신 숫자는 0이 아닙니다.");   // 입력받은 값이 0이 아닌 경우 출력되는 문장
        }
    }
}
