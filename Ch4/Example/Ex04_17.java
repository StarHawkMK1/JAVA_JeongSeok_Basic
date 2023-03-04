package Java_JeongSeok_Basic.Ch4.Example;

// 21. continue문
// continue문은 반복문 내에서만 사용 가능.
// 반복이 진행되는 동안 continue문을 만나면 이후의 문장을 실행하지 않고 반복문의 끝으로 즉시 이동하여 다음 반복으로 넘어간다.
// (break문과는 달리 반복문을 벗아나지 않고 반복을 계속 수행한다)
// for문의 경우 증감식으로 이동하며, while문의 경우 조건식으로 이동한다.

public class Ex04_17 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0)         // 1~10 사이의 정수를 출력하되 3의 배수는 제외
                continue;           // i가 3의 배수인 경우, continue문이 수행되어 출력문을 수행하지 않는다
            System.out.println(i);
        }
    }
}
