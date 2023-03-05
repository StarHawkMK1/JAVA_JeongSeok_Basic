package Java_JeongSeok_Basic.Ch5.Example;

// 8. 배열의 활용(1): 총합과 평균
// for문을 이용하여 배열의 모든 요소를 더하고(총합), 배열의 길이를 이용하여 평균 구하기

public class Ex05_02 {
    public static void main(String[] args) {
        int sum = 0;            // 총합을 저장하기 위한 변수 sum
        float average = 0f;     // 평균을 저장하기 위한 변수 average

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];        // for문을 이용해서 배열score에 저장되어 있는 값들을 모두 더하여 sum에 저장.
        }
        average = sum / (float)score.length;        // 계산 결과를 float타입으로 얻기 위해 형변환

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}
