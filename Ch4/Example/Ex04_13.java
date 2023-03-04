package Java_JeongSeok_Basic.Ch4.Example;

// 17. while문 예제2
// 1부터 몇가지 더해야 100을 넘지 않는지 확인하는 예제

public class Ex04_13 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum <= 100) {
            System.out.printf("%d - %d%n", i, sum);
            sum += ++i;         // i를 1씩 증가시키면서 sum에 누적하여 더해나간다.
        }
    }
}
