package Java_JeongSeok_Basic.Ch6.Example;

// 41. 멤버변수의 초기화 예제2

public class Ex06_15 {
    static int[] arr = new int[10];     // <명시적 초기화> 길이가 10인 int타입 배열 arr 생성.

    static {        // <복잡한 초기화> 클래스 초기화 블록을 이용, 배열의 각 요소를 Math.random()메서드를 사용하여 임의의 값으로 채움.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
