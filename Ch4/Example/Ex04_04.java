package Java_JeongSeok_Basic.Ch4.Example;

// 6. if-else if문
// if-else문은 2가지 경우 중 하나가 수행되는 구조
// 처리해야 할 경우의 수가 셋 이상인 경우 if-else if문 활용

import java.util.Scanner;

public class Ex04_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;          // 점수를 저장하기 위한 변수
        char grade = ' ';       // 학점을 저장하기 위한 변수. (공백으로 초기화)

        System.out.print("점수를 입력하세요.>");
        score = sc.nextInt();   // 사용자로부터 입력받은 값을 변수 score에 저장.

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {       // if블럭의 조건식에서 'score>=90'이 거짓인 것이 밝혀진 경우,
            grade = 'B';                // else if의 조건식에서 'score < 90'이라는 조건을 중복해서 확인할 필요는 없다
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
