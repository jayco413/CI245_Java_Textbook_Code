public class PrintfRounding {
    public static void main(String[] args) {
        double n = 3.14159265358979;
        System.out.printf("%.2f", n);   // 3.14
        System.out.printf("%f", n);     // 3.141593 (default: 6 places)
    }
}
