import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("0.1");
        BigDecimal num2 = new BigDecimal("0.2");

        BigDecimal sum = num1.add(num2);
        System.out.println("Sum: " + sum);  // Sum: 0.3

        BigDecimal product = num1.multiply(num2);
        System.out.println("Product: " + product);  // Product: 0.02
    }
}
