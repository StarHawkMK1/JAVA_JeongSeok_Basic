package Java_JeongSeok_Basic.Ch4.Example;

// 11. switch문
// 단 하나의 조건식으로 많은 경우의 수를 처리하고자 하는 경우에 유용.

import java.util.Scanner;

public class Ex04_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("현재 월을 입력하세요.>");
        int month = sc.nextInt();                   // 사용자로부터 입력받은 값을 변수 month에 저장

        switch(month) {
            case 3: case 4: case 5:
                System.out.println("현재의 계절은 봄입니다.");    // 3, 4, 5 중 하나를 입력받은 경우 출력되는 문장
                break;
            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");   // 6, 7, 8 중 하나를 입력받은 경우 출력되는 문장
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");   // 9, 10, 11 중 하나를 입력받은 경우 출력되는 문장
                break;
            default:    // case 12: case 1: case 2:
                System.out.println("현재의 계절은 겨울입니다.");   // 위의 경우의 수에 전부 해당하지 않을 때 출력되는 문장
        }
    }
}
