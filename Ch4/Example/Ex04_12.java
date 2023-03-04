package Java_JeongSeok_Basic.Ch4.Example;

// 17. while문 예제1

public class Ex04_12 {
    public static void main(String[] args) {
        int i = 5;

        while (i-- != 0) {      // 변수 i의 값만큼 while블럭을 반복
            System.out.println(i + " - I can do it.");
        }
    }
}
