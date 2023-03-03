package Java_JeongSeok_Basic.Ch3.Example;

// 12. 나머지 연산자의 활용

public class Ex3_12 {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;

        System.out.printf("%d을 %d로 나누면, %n", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);
    }
}

// 나머지 연산자(%)는 왼쪽의 피연산자를 오른쪽 피연산자로 나누고 난 나머지를 결괏값으로 반환.
// 나누는 수(오른쪽 피연산자)로 0을 사용할 수 없고, 피연산자로 정수와 실수를 모두 허용함.
// 연산을 수행할 때 부호는 무시됨.
// 주로 짝,홀수 또는 배수 검사 등에 사용됨.
