public class ModularArithmetic {

    public static void main(String[] args) {
        System.out.println(mod(-3, 26));
        System.out.println(mod2(-3, 26));
    }

    public static int mod(int a, int b) {
        int c = a % b;
        return c < 0 ? c + b : c;
    }

    // equivalently, applying % twice:
    public static int mod2(int a, int b) {
        return ((a % b) + b) % b;
    }
}
