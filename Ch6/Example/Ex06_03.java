package Java_JeongSeok_Basic.Ch6.Example;

public class Ex06_03 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        // 클래스변수(static변수)는 객체 생성없이 '클래스명.클래스변수명'로 직접 사용 가능.

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.num = 7;
        // 인스턴스 변수의 값 변경

        Card c2 = new Card();
        c1.kind = "Spade";
        c1.num = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.num + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.num + "이며, 크기는 (" + c2.width + "," + c2.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");

        Card.width = 50;
        Card.height = 80;
        // 클래스변수의 값 변경.

        System.out.println("c1은 " + c1.kind + ", " + c1.num + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.num + "이며, 크기는 (" + c2.width + "," + c2.height + ")");
    }
}

class Card {
    String kind;
    int num;
    static int width = 100;
    static int height = 250;
}
