package Java_JeongSeok_Basic.Ch3.Example;

// 6. 부호 연산자의 활용

public class Ex03_04 {
    public static void main(String[] args) {
        int i = -10;
        i = +i;                     // 음수에 +부호 연산자 적용 => 변화 없음.
        System.out.println(i);

        i = -10;
        i = -i;                     // 음수에 -부호 연산자 적용 => 양수로 전환.
        System.out.println(i);
    }
}
