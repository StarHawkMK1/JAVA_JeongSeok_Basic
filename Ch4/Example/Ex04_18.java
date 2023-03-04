package Java_JeongSeok_Basic.Ch4.Example;

// break문과 continue문 종합예제
// 메뉴를 보여주고 선택하게 하는 예제.

import java.util.Scanner;

public class Ex04_18 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료: 0)> ");

            String tmp = sc.nextLine();         // 사용자로부터 입력받은 값을 tmp에 저장.
            menu = Integer.parseInt(tmp);       // 입력받은 문자열(tmp)을 숫자로 변환.

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;          // 종료(0)을 선택한 경우, break문으로 인해 반복을 벗어나 프로그램을 종료한다.
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue;       // 메뉴를 잘못 선택한 경우, continue문으로 다시 메뉴를 보여준다.
            }
            System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
        }
    }
}
