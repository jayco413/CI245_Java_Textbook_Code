public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        System.out.println(a / b);          // 3   -- integer division truncates
        System.out.println(a % b);          // 1   -- remainder
        System.out.println(a / (double) b); // 3.5 -- one double makes it floating point
        System.out.println(-7 % 2);         // -1  -- sign follows the left operand
        System.out.println(7.5 % 2);        // 1.5 -- % works on doubles too
    }
}
