package Java_JeongSeok_Basic.Ch6.Example;

// 6. 객체의 생성과 사용
// Tv클래스로부터 인스턴스를 생성하고, 인스턴스의 속성(channel)과 메서드(channelDown())을 사용하는 방법을 보여주는 예제.
// Tv클래스를 선언하는 것은 Tv의 설계도를 작성하는 것에 불과. Tv인스턴스를 생성해야 제품(Tv(을 사용할 수 있다.
// 다음 예제는 클래스로부터 인스턴스를 생성하는 일반적인 방법이다.

public class Ex06_01 {
    public static void main(String[] args) {
        Tv t;                   // Tv인스턴스를 참조하기 위한 변수 t를 선언.
        t = new Tv();           // Tv인스턴스를 생성한다.                           < 객체 생성 >
        t.channel = 7;          // Tv인스턴스의 멤버변수 channel의 값을 7로 저장한다.  < 객체의 변수 사용 >
        t.setChannelDown();     // Tv인스턴스의 메서드 channelDown()을 호출한다.     < 객체의 메서드 사용 >
        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }
}

class Tv {
    // Tv의 속성(멤버변수)
    String color;       // 색상
    boolean power;      // 전원상태(on/off)
    int channel;        // 채널

    // Tv의 기능(메서드)
    void power() {              // Tv를 켜거나 끄는 기능을 하는 메서드
        power = !power;
    };
    void channelUp() {          // Tv의 채널을 높이는 기능을 하는 메서드
        ++channel;
    }
    void setChannelDown() {     // Tv의 채널을 낮추는 기능을 하는 메서드
        --channel;
    }
}
