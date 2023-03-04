package Java_JeongSeok_Basic.Ch3.Example;

// 10. 산술 변환에 대한 이해

public class Ex03_10 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;         // int타입의 범위를 벗어남. 잘못된 결괏값을 반환.
        long b = 1_000_000 * 1_000_000L;        // 피연산자 중 하나를 long타입으로 형변환해 주었기 때문에 올바른 결괏값을 반환.

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
