public class ConditionalOperator {
    public static void main(String[] args) {
        int score = 72;

        String result = score >= 60 ? "pass" : "fail";
        System.out.println(result);                    // pass

        int a = 9;
        int b = 4;
        System.out.println(a > b ? a : b);              // 9

        // Nesting reads left to right, like a chain of else-ifs.
        int n = 0;
        System.out.println(n > 0 ? "positive"
                         : n < 0 ? "negative"
                         : "zero");                     // zero
    }
}
