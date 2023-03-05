package Java_JeongSeok_Basic.Ch5.Example;

// 16. 커맨드 라인을 통해 입력받기
// 프로그램을 실행할 때 클래스이름 뒤에 공백문자로 구분하여 여러 개의 문자열을 프로그램에 전달
// 커맨드 라인에 입력된 매개변수는 공백문자로 구분하기 때문에 입력될 값에 공백이 있는 경우 큰따옴표로 감싸주어야 한다.
// 그리고 커맨드 라인에서 숫자를 입력해도 숫자가 아닌 문자열로 처리된다는 것에 주의.
// 커맨드 라인에 매개변수를 입력하지 않으면 길이가 0인 배열이 생성됨.

public class Ex05_07 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
