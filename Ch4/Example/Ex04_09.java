package Java_JeongSeok_Basic.Ch4.Example;

// 14. for문

public class Ex04_09 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);      // i값 세로로 출력 (줄 바꿈)
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print(i);        // i값 가로로 이어서 출력 (줄 바꿈 X)
        }
        System.out.println();
    }
}
