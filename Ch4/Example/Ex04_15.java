package Java_JeongSeok_Basic.Ch4.Example;

// 19. do-while문
// while문과 기본적인 구조는 같으나 while문 전에 do블럭 내의 문장을 최소한 한번 무조건 수행하도록 하는 반복문이다.

// Math.random() 메서드를 활용하여 1~100 사이의 임의의 수를 변수 answer에 저장하고, 이 값을 맞출 때까지 반복하는 예제
// 사용자 입력값 input과 변수 answer의 값이 일치할 때까지 반복

import java.util.Scanner;

public class Ex04_15 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;   // 1~100 사이의 임의의 정수를 변수 answer에 저장 <사용자가 맞춰야하는 숫자>

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요.> ");
            input = sc.nextInt();       // 사용자가 입력하는 값을 변수 input에 저장 <정답을 맞추기 위해 사용자가 시도하는 숫자>

            if (input > answer) {           // 사용자가 입력한 숫자가 정답보다 큰 경우
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if (input < answer) {    // 사용자가 입력한 숫자가 정답보다 작은 경우
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while (input != answer);      // 사용자가 입력한 숫자와 정답이 일치하지 않는 경우 계속 반복

        System.out.println("정답입니다.");
    }
}
