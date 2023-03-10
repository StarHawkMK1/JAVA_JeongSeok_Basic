package Java_JeongSeok_Basic.Ch6.Example;

// 23. 기본형 매개변수

class Data { int x; }

public class Ex06_06 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;       // 참조변수 d가 가리키는 멤버변수 x의 값이 10.
        System.out.println("main() : x = " + d.x);

        change(d.x);    // change() 메서드 호출.
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change (int x) {   // main메서드에서 change메서드가 호출되면서 'd.x'가 change메서드의 기본형 매개변수 x에 복사됨.
        x = 1000;    // change()메서드의 지역변수 x. change()메서드에서 x의 값을 1000으로 변경.
        System.out.println("change() : x = " + x);
    }       // change() 메서드가 종료되면서 매개변수 x는 스택에서 제거됨.
}


