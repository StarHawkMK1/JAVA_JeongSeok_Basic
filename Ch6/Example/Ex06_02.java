package Java_JeongSeok_Basic.Ch6.Example;

// 7. 객체의 생성과 사용
// 같은 클래스로부터 생성되었을지라도, 각 인스턴스의 멤버변수는 서로 다른 값을 유지할 수 있으며,
// 메서드의 내용은 모든 인스턴스에 대해 동일

public class Ex06_02 {
    public static void main(String[] args) {
        Tv t1 = new Tv();       // Tv t1; t1 = new Tv();를 한 문장으로 단순화
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t1.channel = 7;         // 객체 t1의 channel 값을 7로 저장.
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
    }
}


