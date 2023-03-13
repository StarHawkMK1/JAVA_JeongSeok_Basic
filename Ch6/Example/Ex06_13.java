package Java_JeongSeok_Basic.Ch6.Example;

// 36. 생성자에서 다른 생성자 호출하기 - this()
// 다음의 조건을 만족하면 같은 클래스의 생성자 간에 서로 호출 가능.
// - 생성자의 이름으로 클래스이름 대신 this를 사용해야 하며,
// - 한 생성자에서 다른 생성자를 호출할 때에는 반드시 첫 줄에서만 호출이 가능.

public class Ex06_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c1의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}

class Car2 {
    String color;       // 색상
    String gearType;    // 변속기 종류(auto/manual)
    int door;           // 문의 개수

    Car2() {        // 기본값. Car2 (String color, String gearType, int door)를 호출.
        this("white", "auto", 4);       // 생성자 간의 호출에는 생성자의 이름 대신 this를 사용
    }

    Car2(String color) {        // 색만 변경되는 생성자. Car2 (String color, String gearType, int door)를 호출
        this(color, "auto", 4);
    }

    Car2 (String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
