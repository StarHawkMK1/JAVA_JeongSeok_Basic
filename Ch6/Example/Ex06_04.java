package Java_JeongSeok_Basic.Ch6.Example;

// 19. 메서드의 실행 흐름
// 사칙연산을 위한 4개의 메서드가 정의 되어 있는 MyMath클래스를 이용한 예제.
// 클래스에 선언된 메서드를 어떻게 호출하는지 확인하기

public class Ex06_04 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);      // MyMath클래스의 add메서드 호출
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}

class MyMath {      // MyMath클래스 작성
    long add(long a, long b) {
        long result = a + b;
        return result;
        // 위 2줄을 'return a + b;' 와 같이 한 줄로 단순화할 수 있다.
    }

    long subtract(long a, long b) { return a - b; }
    long multiply(long a, long b) { return a * b; }
    long divide(long a, long b) { return a / b; }
}
