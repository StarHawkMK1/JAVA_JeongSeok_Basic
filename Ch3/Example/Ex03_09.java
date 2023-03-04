package Java_JeongSeok_Basic.Ch3.Example;

// 10. 산술 변환에 대한 이해

public class Ex03_09 {
    public static void main(String[] args) {
        int a = 1_000_000;      // 10의 6제곱
        int b = 2_000_000;      // 10의 6제곱 이상

        long c = a * b;         // 10의 12제곱 이상 BUT int타입의 범위는 약 10의 9제곱이므로 오버플로우가 발생하여 잘못된 값이 반환됨.
                                // 올바른 값을 얻기 위해서는 long타입으로 형변환 필요. -> 예제3-10
        System.out.println(c);
    }
}
