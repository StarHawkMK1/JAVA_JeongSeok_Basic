package Java_JeongSeok_Basic.Ch5.Example;

// 11. 배열의 활용(4): 로또 번호 만들기
// 길이가 45인 배열에 1부터 45까지의 값을 저장하고,
// 반복문을 이용해서 배열의 인덱스가 i인 값(ball[i])과 random()에 의해서 결정된 임의의 위치에 있는 값과 자리를 교환하는 작업을 6번 반복

public class Ex05_05 {
    public static void main(String[] args) {
        int[] ball = new int[45];       // 45개의 정숫값을 저장하기 위한 배열 ball 생성.

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;            // 배열의 각 요소에 1~45의 값이 저장되도록 변경
        }                               // [0, ..., 44] -> [1, ..., 45]

        int tmp = 0;        // 두 값을 바꾸는데 사용할 임시 변수
        int j = 0;          // 임의의 값을 얻어서 저장할 변수

        for (int i = 0; i < 6; i++) {           // 0번째부터 5번째 요소까지 모두 6개만 바꿈.
            j = (int)(Math.random() * 45);      // 0~44범위의 임의의 값 얻기
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;                      // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꾸어 값을 섞는다.
        }

        for (int i = 0; i < 6; i++) {           // 배열 ball의 앞 6개 요소를 출력
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }
    }
}
