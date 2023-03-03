package Java_JeongSeok_Basic.Ch3.Example;

// 16. 논리부정연산자(!)의 활용
// 단항 연산자는 결합 방향이 오른쪽에서 왼쪽이므로 피연산자와 가까운 연산자부터 먼저 연산된다.
// !!b -> !!true -> !false -> true

public class Ex3_16 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b = %b%n", b);
        System.out.printf("!b = %b%n", !b);
        System.out.printf("!!b = %b%n", !!b);
        System.out.printf("!!!b = %b%n", !!!b);
        System.out.println();

        System.out.printf("ch = %c%n", ch);
        System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z');
        System.out.printf("!('a' <= ch && ch <= 'z') = %b%n", !('a' <= ch && ch <= 'z'));
        System.out.printf("  'a' <= ch && ch <= 'z'  = %b%n", 'a' <= ch && ch <= 'z');
    }
}
