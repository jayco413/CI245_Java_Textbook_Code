import java.time.LocalDateTime;

public class DateTimeConversions {
    public static void main(String[] args) {
        LocalDateTime when = LocalDateTime.of(2026, 8, 23, 14, 5, 9);

        System.out.printf("%tY-%<tm-%<td%n", when);   // 2026-08-23
        System.out.printf("%tH:%<tM:%<tS%n", when);   // 14:05:09
        System.out.printf("%tB %<te, %<tY%n", when);  // August 23, 2026
        System.out.printf("%tA%n", when);             // Sunday
    }
}
