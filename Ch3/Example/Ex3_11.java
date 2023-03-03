package Java_JeongSeok_Basic.Ch3.Example;

// Math.round()를 활용하여 반올림하기.
// -> 소수점 첫째 자리에서 반올림한 결과를 정수로 반환.
// IF 소수점 첫째 자리가 아닌 다른 자리에서 반올림을 하고자 한다면, 10의 n제곱으로 적절히 곱하고 나누어줘야 함.

public class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);
    }
}

// Math.round(3.141592 * 1000) / 1000.0
// -> Math.round(3141.592) / 1000.0
// -> 3141 / 1000.0                     ( -> 실수값을 얻기 위해서는 반드시 1000이 아닌 1000.0으로 나누어줘야 함.)
// -> 3.142