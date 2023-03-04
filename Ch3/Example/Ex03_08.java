package Java_JeongSeok_Basic.Ch3.Example;

// 10. 산술 변환에 대한 이해

public class Ex03_08 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a * b);
        System.out.println(c);      // 10*30의 결과는 300이지만, 출력 결과는 44.
    }                               // 큰 자료형에서 작은 자료형으로 변환하면 데이터의 손실이 발생하므로 정확한 값을 반환받을 수 없음.
}                                   // 300은 byte형의 범위를 벗어나기 때문에 byte형으로 변환하면 데이터의 손실이 발생하여 잘못된 값이 저장됨.
