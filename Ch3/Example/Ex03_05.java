package Java_JeongSeok_Basic.Ch3.Example;

// 7. 형변환 연산자의 활용

public class Ex03_05 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;     // d의 값을 정숫값으로 형변환하여 score에 저장.

        System.out.println("score = " + score); // 85 출력
        System.out.println("d = " + d);         // 85.4 출력. 형변환 후에도 피연산자에는 변화 없음
    }
}
