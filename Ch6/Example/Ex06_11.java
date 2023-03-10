package Java_JeongSeok_Basic.Ch6.Example;

// 33. 기본 생성자(default constructor)
// 모든 클래스에는 반드시 하나 이상의 생성자가 정의되어 있어야 함.

class Data_1 {
    int value;
    Data_1 () {}
}

class Data_2 {
    int value;

    Data_2 () {}

    Data_2(int x) {     // 매개변수가 있는 생성자
        value = x;
    }
}

public class Ex06_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2();
    }
}
