package Java_JeongSeok_Basic.Ch3.Example;

// 5. 증감 연산자의 활용1

public class Ex3_2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;        // 후위형. 값이 참조된 후에 증가시킴.
        System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);

        i = 5;
        j = 0;

        j = ++i;       // 전위형. 값이 참조되기 전에 증가시킴.
        System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j);
    }
}
