package Java_JeongSeok_Basic.Ch4.Example;

// 18. while문 예제3
// 사용자로부터 값을 입력받고, 해당 숫자의 각 자리의 합을 구하는 예제.

import java.util.Scanner;

public class Ex04_14 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요.(예: 12345)>");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();             // 사용자로부터 입력받은 값을 tmp에 저장
        num = Integer.parseInt(tmp);            // 입력받은 문자열(tmp)을 숫자로 변환.

        while (num != 0) {
            sum += num % 10;        // num을 10으로 나눈 나머지를 sum에 더함
            System.out.printf("sum = %3d, num = %d%n", sum, num);

            num /= 10;              // num을 10으로 나눈 값을 다시 num에 저장
        }
        System.out.println("각 자리수의 합: " + sum);
    }
}
        // 어떤 수를 10으로 나머지 연산하면 마지막 자리를 얻을 수 있다.
        // 그리고 다시 10으로 나누면 마지막 자리를 제거할 수 있다.
