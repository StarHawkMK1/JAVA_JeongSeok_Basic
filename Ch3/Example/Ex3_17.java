package Java_JeongSeok_Basic.Ch3.Example;

// 17. 조건연산자의 활용
// 조건 연산자를 이용해서 변수의 절댓값을 구한 후, 부호를 붙여 출력하는 예제.

public class Ex3_17 {
    public static void main(String[] args) {

        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = (x >= 0) ? x : -x;       // x,y,z의 값이 음수이면 양수로 전환.
        absY = (y >= 0) ? y : -y;
        absZ = (z >= 0) ? z : -z;
        signX = (x > 0) ? '+' : ( x==0 ? ' ' : '-');        // 조건연산자의 중첩
        signY = (y > 0) ? '+' : ( y==0 ? ' ' : '-');
        signZ = (z > 0) ? '+' : ( z==0 ? ' ' : '-');

        System.out.printf("x = %c%d%n", signX, absX);
        System.out.printf("y = %c%d%n", signY, absY);
        System.out.printf("z = %c%d%n", signZ, absZ);
    }
}
