package Java_JeongSeok_Basic.Ch5.Example;

// 23. 2차원 배열의 초기화3
// 영어단어를 보여주고 단어의 뜻을 맞추는 예제.

import java.util.Scanner;

public class Ex05_10 {
    public static void main(String[] args) {
        String[][] words = {            // words[i][0]은 문제, words[i][1]은 답
                {"chair", "의자"},       // words[0][0], words[0][1]
                {"computer", "컴퓨터"},  // words[1][0], words[1][1]
                {"integer", "정수"}      // words[2][0], words[2][1]
        };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);   // 문제에 해당하는 words[i][0]을 화면에 출력.


            String tmp = sc.nextLine();             // 사용자로부터 입력받은 답을 tmp에 저장.

            if (tmp.equals(words[i][1])) {          // equals() 메서드로 tmp와 words[i][1]을 비교해서 정답인지 확인.
                System.out.printf("정답입니다.%n%n");        // 문자열을 비교할 때에는 등가연산자(==) 사용하지 않도록 주의
            } else {                                                                          // (예제03_14참고)
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
            }
        }
    }
}