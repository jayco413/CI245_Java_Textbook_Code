public class PrintfWidthDemo {
    public static void main(String[] args) {
        System.out.printf("[%10.2f]%n", 8560.75);  // [   8560.75]
        System.out.printf("[%-8s]%n", "Month");    // [Month   ]
        System.out.printf("[%8s]%n", "Month");     // [   Month]
        System.out.printf("[%3d]%n", 12345);       // [12345]
    }
}
