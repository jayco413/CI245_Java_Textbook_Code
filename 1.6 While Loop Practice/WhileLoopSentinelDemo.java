import java.util.Scanner;

public class WhileLoopSentinelDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != 0) {
            System.out.println(num);
            num = scanner.nextInt();
        }
    }
}
