package Java_JeongSeok_Basic.Ch6.Example;

// 24. 참조형 매개변수

class Data2 { int x; }

public class Ex06_07 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;       // 참조변수 d가 가리키는 멤버변수 x의 값이 10.
        System.out.println("main() : x = " + d.x);

        change(d);      // change() 메서드 호출.
        System.out.println("After change(d)");
        System.out.println("main()  = " + d.x);
    }

    static void change(Data2 d) {   // main메서드에서 change메서드가 호출되면서 참조변수 d의 값(주소)이 참조형 매개변수 d에 복사됨.
                                    // (매개변수 d에 저장된 주소값으로 x에 접근 가능)
        d.x = 1000;     // change() 메서드에서 매개변수 d로 x의 값을 1000으로 변경.
        System.out.println("change() : x = " + d.x);
    }       // change() 메서드가 종료되면서 참조형 매개변수 d는 스택에서 제거됨.
}

// change메서드를 호출한 후에 d.x의 값이 변경되었다.
// change메서드의 매개변수가 참조형이라서 값이 아니라 '값이 저장된 주소'를 change메서드에게 넘겨주었기 때문에
// 값을 읽어오는 것뿐만 아니라 변경하는 것도 가능하다.
