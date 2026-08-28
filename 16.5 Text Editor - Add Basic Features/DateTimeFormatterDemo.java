import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String timeString = dtf.format(now);
        System.out.println(timeString);
    }
}
