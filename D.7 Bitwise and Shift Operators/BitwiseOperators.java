public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 12;  // 1100
        int b = 10;  // 1010

        System.out.println(a & b);    // 8  -- 1000
        System.out.println(a | b);    // 14 -- 1110
        System.out.println(a ^ b);    // 6  -- 0110
        System.out.println(a << 2);   // 48 -- 110000
        System.out.println(a >> 2);   // 3  -- 11

        int negative = -8;
        System.out.println(negative >> 1);   // -4 -- sign bit copied in
        System.out.println(negative >>> 28); // 15 -- zeros shifted in instead
    }
}
