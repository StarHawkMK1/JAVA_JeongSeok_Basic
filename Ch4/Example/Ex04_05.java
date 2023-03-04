package Java_JeongSeok_Basic.Ch4.Example;

// 8. 중첩 if문

import java.util.Scanner;

public class Ex04_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력해주세요.>");
        score = sc.nextInt();                   // 사용자로부터 입력받은 값을 score에 저장.

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if (score >= 90) {              // score가 90점보다 크거나 같으면 A학점 (외부 if문에서 grade 결정.)
            grade = 'A';
            if (score >= 98) {          // 90점 이상이면서도 98점 이상인 경우 A+ (내부 if문에서 grade를 세부적으로 평가.)
                opt = '+';
            } else if (score < 94) {    // 90점 이상이면서 94점 미만인 경우 A-
                opt = '-';
            }
        } else if (score >= 80) {       // score가 80점보다 크거나 같으면 B학점
            grade = 'B';
            if (score >= 88) {
                opt = '-';
            }
        } else {                        // 그외 나머지 경우는 C학점
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
    }
}
