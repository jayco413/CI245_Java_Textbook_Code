import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class CalendarExample {

    public static Calendar getCalendar(
            int day, int month, int year, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month - 1); // 0-indexed
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        return calendar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the hour (24-hour format): ");
        int hour = scanner.nextInt();
        System.out.print("Enter the minute: ");
        int minute = scanner.nextInt();
        System.out.print("Enter the second: ");
        int second = scanner.nextInt();

        Calendar calendar = getCalendar(day, month, year, hour, minute, second);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy h:mm a");
        String formattedDate = sdf.format(calendar.getTime());
        System.out.println("Calendar date: " + formattedDate);
    }
}
