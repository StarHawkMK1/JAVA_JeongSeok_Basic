package Java_JeongSeok_Basic.Ch5.Example;

// 13. String배열의 초기화
// 특별히 String클래스만 new연산자를 통한 객체 생성을 생략하고 큰따옴표만으로 간략히 초기화하는 것이 허용됨.

public class Ex05_06 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] : " + names[i]);  // names배열에 저장된 요소를 순서대로 출력
        }

        String tmp = names[2];      // 배열 names의 세 번째 요소를 String타입 변수 tmp에 저장
        System.out.println("tmp : " + tmp);
        names[0] = "Yu";            // 배열 names의 첫 번째 요소를 "Yu"로 변경

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);           // 변경 사항 확인하기 위해 출력.
        }
    }
}
