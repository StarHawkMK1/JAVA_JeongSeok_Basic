package Java_JeongSeok_Basic.Ch3.Example;

// 9. 사칙연산자의 활용

public class Ex03_06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);  // 나누기 연산자의 두 피연산자가 모두 int타입인 경우, 연산결과 역시 int타입. 반올림이 발생하지 않는다는 점에 유의.
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
    }                    // 올바른 연산결과를 얻기 위해서는, 두 피연산자 중 어느 한 쪽을 실수형으로 형변화해야.
}                        // 그래야 다른 한 쪽도 실수형으로 자동 형변환되어 연산 결과를 실수값으로 받을 수 있다.
