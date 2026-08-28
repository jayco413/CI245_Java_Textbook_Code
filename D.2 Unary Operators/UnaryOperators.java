public class UnaryOperators {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i++);   // 5 -- prints, then increments
        System.out.println(i);     // 6

        int j = 5;
        System.out.println(++j);   // 6 -- increments, then prints
        System.out.println(j);     // 6

        int k = 5;
        System.out.println(-k);    // -5
        System.out.println(~k);    // -6 -- bitwise complement
        System.out.println(!true); // false
    }
}
