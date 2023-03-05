package Java_JeongSeok_Basic.Ch5.Example;

// 9. 배열의 활용(3): 섞기(shuffle)
// Math.random() 메서드와 임시 변수 tmp를 사용하여 배열의 요소 섞기

import java.util.Arrays;

public class Ex05_04 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < 100; i++) {             // 100대신에 배열의 길이(numArr.length)만큼만 셔플해도 괜찮음.
            int n = (int)(Math.random() * 10);      // 0~9 사이의 임의의 정숫값을 n에 저장
            int tmp = numArr[0];                    // 배열의 요소를 임시로 저장할 변수 tmp를 만들고,
            numArr[0] = numArr[n];                  // numArr[0]과 numArr[n]의 값을 교환하는 작업을 100번 수행
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));    // 출력하여 셔플 결과를 확인.
    }
}
