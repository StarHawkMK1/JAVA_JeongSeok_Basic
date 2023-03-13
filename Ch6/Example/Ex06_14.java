package Java_JeongSeok_Basic.Ch6.Example;

// 40. 멤버변수의 초기화 예제1

public class Ex06_14 {
    static {
        System.out.println("static { }");       // 클래스 초기화 블록. 가장 먼저 수행되며, 처음 메모리에 로딩될 때 한번만 수행.
    }

    {
        System.out.println("{ }");              // 인스턴스 초기화 블록. 인스턴스가 생성될 때마다 수행.
    }

    public Ex06_14() {
        System.out.println("생성자");            // 생성자. 인스턴스 초기화 블록이 수행되고 마지막에 수행.
    }

    public static void main(String[] args) {
        System.out.println("Ex06_14 bt = new Ex06_14();");
        Ex06_14 bt = new Ex06_14();

        System.out.println("Ex06_14 bt2 = new Ex06_14();");
        Ex06_14 bt2 = new Ex06_14();
    }
}
