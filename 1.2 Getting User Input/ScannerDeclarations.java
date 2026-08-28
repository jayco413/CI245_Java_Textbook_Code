import java.util.Scanner;

public class ScannerDeclarations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double decimal = scanner.nextDouble();
        String line = scanner.next();
        boolean bool = scanner.nextBoolean();
    }
}
