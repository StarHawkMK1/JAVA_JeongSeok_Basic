package Java_JeongSeok_Basic.Ch6.Example;

// 25. 참조형 반환타입
// 매개변수 뿐만 아니라 반환타입도 참조형이 될 수 있다. 반환타입이 참조형이라는 것은 반환하는 값의 타입이 참조형이라는 것.
// 모든 참조형 타입의 값은 '객체의 주소'이므로 정수값이 반환되는 것.
// "반환타입이 참조형이라는 것은, 객체의 주소를 반환한다는 것."

class Data3 { int x; }
public class Ex06_08 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();    // 새로운 객체 tmp 생성.

        tmp.x = d.x;                // d.x의 값을 tmp.x에 복사.

        return tmp;                 // 복사한 객체의 주소를 반환. (반환하는 값이 Data3객체의 주소이므로 반환타입이 Data3인 것)
    }
}
