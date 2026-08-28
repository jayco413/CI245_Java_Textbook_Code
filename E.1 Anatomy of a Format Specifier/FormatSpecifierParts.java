public class FormatSpecifierParts {
    public static void main(String[] args) {
        System.out.printf("[%10.2f]%n", 1234.5678);  // [   1234.57]
        System.out.printf("[%-10s]%n", "left");      // [left      ]
        System.out.printf("[%,d]%n", 1234567);       // [1,234,567]
        System.out.printf("[%2$s %1$s]%n", "world", "hello"); // [hello world]
        System.out.printf("[%s %<s]%n", "twice");    // [twice twice]
        System.out.printf("100%%%n");                // 100%
    }
}
