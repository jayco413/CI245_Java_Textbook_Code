public class ModularInverse {

    public static void main(String[] args) {
        System.out.println(modularInverse(5, 26));
    }

    private static int modularInverse(int a, int m) {
        int inverse = 1;
        while (a * inverse % m != 1) {
            inverse++;
        }
        return inverse;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
