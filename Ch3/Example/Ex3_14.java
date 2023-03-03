package Java_JeongSeok_Basic.Ch3.Example;

// 14. 문자열의 비교
// 문자열을 비교할 때에는 비교연산자'==' 대신에 equal() 메서드를 사용해야 한다.
// 비교연산자'=='는 객체의 주소가 같은지를 비교하는 것이고, 객체의 내용이 같은지를 확인하기 위해서는 equals() 메서드를 사용해야 함.

public class Ex3_14 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
        System.out.printf(" str1 == \"abc\" ? %b%n", str1 == "abc");
        System.out.printf(" str2 == \"abc\" ? %b%n", str2 == "abc");
            // str2와 "abc"의 내용이 같은데도 '=='연산자로 비교하면 false가 반환된다.
            // 내용은 같지만 서로 다른 객체이기 때문에 객체의 참조주소가 달라서 그런 것.

        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
            // equals() 메서드를 사용하면 객체가 다르더라도 내용이 같으면 true를 반환한다.
            // 따라서, 문자열을 비교할 때에는 항상 equals() 메서드를 사용해야 한다.

        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
    }       // 대소문자를 구별하지 않고 비교하고 싶으면 equalsIgnoreCase() 메서드를 사용하면 된다.
}
