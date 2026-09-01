public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(2 + 3 * 4);              // 14 -- * before +
        System.out.println((2 + 3) * 4);            // 20 -- parentheses win
        System.out.println(10 - 4 - 3);             // 3  -- - is left to right
        System.out.println(1 + 2 == 3);             // true -- + before ==
        System.out.println(1 << 2 + 3);             // 32 -- + before <<, so 1 << 5
        System.out.println(true || false && false); // true -- && before ||
        System.out.println(1 + 2 + "x");            // 3x -- + is left to right
        System.out.println("x" + 1 + 2);            // x12 -- same rule, other order
    }
}
