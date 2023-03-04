package Java_JeongSeok_Basic.Ch4.Example;

// 20. break문
// break문은 자신이 포함된 가장 가까운 반복문을 벗어남.
// 주로 if문과 함께 사용되어 특정 조건을 만족할 때 반복문을 벗어나게 한다.

// 숫자를 1부터 몇까지 더하면 합이 100을 넘는지 확인하는 예제.
public class Ex04_16 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while(true) {       // -> while문의 조건식에 true를 사용하면 무한 반복문이 된다.
            if(sum > 100)
                break;
            ++i;        // i의 값을 1부터 1씩 계속 증가시켜가며 ->
            sum += i;   // -> sum에 저장
        }               // sum의 값이 100을 넘으면 if문의 조건식이 true가 되므로 break문이 수행되어 자신이 속한 반복문을 벗어남.
                        // 무한 반복문에는 조건문과 break문이 항상 같이 사용된다. 그렇지 않으면 조건을 만족하더라도 무한 루프에 빠져서 프로그램이 종료되지 않는다.

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
