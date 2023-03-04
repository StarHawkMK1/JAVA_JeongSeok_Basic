package Java_JeongSeok_Basic.Ch4.Example;

// 14. for문
// 1부터 5까지의 합을 구하는 예제

public class Ex04_10 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;           // 변수 i를 1부터 5까지 변화시키면서 i를 sum에 계속 더해서 누적시킨다.
            System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
        }
    }
}
