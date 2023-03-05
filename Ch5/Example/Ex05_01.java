package Java_JeongSeok_Basic.Ch5.Example;

// 5. 배열의 초기화 및 출력 등

import java.util.Arrays;    // Arrays.toString() 메서드를 사용하기 위해 import

public class Ex05_01 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];              // 길이가 10인 int타입 배열 iArr1 생성.
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60};    // 배열의 생성과 초기화 동시에. (=) int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {        // '배열이름.length' -> 배열의 길이 반환
            iArr1[i] = i + 1;       // 1~10의 정수를 순서대로 배열에 저장.
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random() * 10) + 1;       // 1~10 사이의 정수값을 배열에 저장.
        }

        for (int i = 0; i < iArr1.length; i++) {            // 배열 iArr1에 저장된 값들을 출력
            System.out.print(iArr1[i] + ",");               // 각 요소 간의 구분을 위해 쉼표 추가
        }
        System.out.println();       // 다음 출력이 바로 이어지지 않도록 줄 바꿈.

        // 'Arrays.toString(배열이름)' -> 배열의 모든 요소를 '[첫 번째 요소, 두 번째 요소, ...]'와 같은 형식의 문자열로 반환.
        System.out.println(Arrays.toString(iArr2));         // 배열 iArr2에 저장된 값들을 '[3, 4, 8, 10 ...]'의 형태로 출력.  random값이기 때문에 출력할 때마다 값은 달라짐.
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);          // 배열을 가리키는 참조변수 iArr3의 값을 출력. '[타입@주소'와 같은 형태로 출력
        System.out.println(chArr);          // 예외적으로 char타입 배열은 println메서드로 출력하면 각 요소가 구분자 없이 그대로 출력.
    }
}
