package Java_JeongSeok_Basic.Ch6.Example;

// 22. 호출 스택(call stack)

public class Ex06_05 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

// 1) 위의 예제를 실행시키면, JVM에 의해서 main메서드가 호출됨으로써 프로그램이 시작된다.
//    이 떄, 호출스택에는 main메서드를 위한 메모리공간이 할당되고 main메서드의 코드가 수행되기 시작한다.

// 2) main메서드에서 println()메서드를 호출한 상태이다.
//    아직 main메서드가 끝난 것은 아니므로 main메서드는 호출스택에 대기상태로 남아 있고, println() 메서드의 수행이 시작된다.
//    println()메서드에 의해 'Hello'가 화면에 출력된다.

// 3) println()메서드의 수행이 완료되어 호출스택에서 사라지고 자신을 호출한 main메서드로 복귀한다.
//    대기 중이던 main메서드는 println()을 호출한 이후부터 수행을 재개한다.

// 4) main메서드에도 더 이상 수행할 코드가 없으므로 정료되어, 호출스택은 완전히 비워지게 되고 프로그램은 종료된다.
