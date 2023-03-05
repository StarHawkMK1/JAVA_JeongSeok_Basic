package Java_JeongSeok_Basic.Ch5.Example;

// 9. 배열의 활용(2): 최댓값과 최솟값
// for문과 if-else if문을 사용하여 배열에 담긴 값의 최댓값과 최솟값 구하기.

public class Ex05_03 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];         // 배열의 첫 번째 값으로 최댓값을 초기화
        int min = score[0];         // 배열의 첫 번째 값으로 최솟값을 초기화

        for (int i = 1; i < score.length; i++) {    // 배열의 두 번째 요소부터 비교하기 위해 변수 i의 값을 1로 초기화
            if (score[i] > max) {
                max = score[i];             // 배열에 담긴 값이 max에 저장된 값보다 크다면, 이 값을 max에 대체하여 저장.
            } else if (score[i] < min) {
                min = score[i];             // 배열에 담긴 값이 min에 저장된 값보다 작다면, 이 값을 min에 대체하여 저장.
            }
        }                              // 이런 식으로 배열의 마지막 요소까지 반복 비교하면 max에는 최댓값이, min에는 최솟값이 저장됨.

        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);
    }
}
