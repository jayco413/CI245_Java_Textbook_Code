public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers below 1000:");

        for (int n = 1; n < 10000; n++) {
            int sum = 1;
            for (int d = 2; d < n / 2; d++) {
                if (n % d == 0) {
                    sum += d;
                }
            }
            if (sum == n) {
                System.out.println(n);
            }
        }
    }
}
