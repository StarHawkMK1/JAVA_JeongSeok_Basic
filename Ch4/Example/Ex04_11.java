package Java_JeongSeok_Basic.Ch4.Example;

// 15. 중첩 for문
// 직각삼각형 모양의 별 출력하기.

public class Ex04_11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");      // i값과 연동해서 가로로 별의 개수를 이어서 출력
            }
            System.out.println();           // 내부 for문을 1회 실행할 때마다 줄 바꿈.
        }
    }
}
