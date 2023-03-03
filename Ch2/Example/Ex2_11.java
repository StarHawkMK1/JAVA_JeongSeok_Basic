package Java_JeongSeok_Basic.Ch2.Example;

// 16. 정수의 오버플로우

public class Ex2_11 {
    public static void main(String[] args) {    // short => 2byte = 16bit = 2^16 = 65536
        short sMin = -32768, sMax = 32767;      // -> 부호 있는 정수   -32768 ~ 32767
        char cMin = 0, cMax = 65535;            // -> 부호 없는 정수   0 ~ 65535

        System.out.println("sMin   = " + sMin);
        System.out.println("sMin-1 = " + (short)(sMin - 1));
        System.out.println("sMax   = " + sMax);
        System.out.println("sMax+1 = " + (short)(sMax + 1));
        System.out.println("cMin   = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)--cMin);
        System.out.println("cMax   = " + (int)cMax);
        System.out.println("cMax+1 = " + (int)++cMax);
    }
}
