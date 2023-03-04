package Java_JeongSeok_Basic.Ch4.Example;

// 12. Math.random() 메서드를 활용하여 임의의 정수 만들기.
// Math.random()은 0.0과 1.0 사이의 임의의 double값을 반환하는 메서드
// 특정 범위의 정수값을 반환받고 싶은 경우, 적절한 수를 곱하고 (int)형으로 형번환한 후, 필요에 따라 +1

public class Ex04_07 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 5; i++) {
            num = (int)(Math.random() * 6) + 1;
            System.out.println(num);
        }
    }       // for문을 활용하여 1과 6사이의 임의의 정수를 얻어 출려하는 작업을 5번 반복.
}
