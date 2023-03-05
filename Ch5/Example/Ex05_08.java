package Java_JeongSeok_Basic.Ch5.Example;

// 21. 2차원 배열의 초기화1
// 2차원 배열 score의 모든 요소의 합을 구하고 출력하는 예제

public class Ex05_08 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        int sum = 0;        // 모든 요소의 합을 저장할 변수 sum

        for (int i = 0; i < score.length; i++) {            // 2차원 배열 행의 개수
            for (int j = 0; j < score[i].length; j++) {     // 2차원 배열 열의 개수
                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);

                sum += score[i][j];         // score배열의 모든 요소의 합을 sum에 저장
            }
        }

        System.out.println("sum = " + sum);
    }
}
