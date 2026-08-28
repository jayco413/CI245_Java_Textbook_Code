import java.util.Calendar;
import java.util.Scanner;

public class CalendarPractice {

    public static Calendar getCalendar(
            int day, int month, int year, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month - 1);
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
        System.out.print("Enter the hour: ");
        int hour = scanner.nextInt();
        System.out.print("Enter the minute: ");
        int minute = scanner.nextInt();
        System.out.print("Enter the second: ");
        int second = scanner.nextInt();

        Calendar calendar = getCalendar(day, month, year, hour, minute, second);

        // ADD YOUR CODE HERE -- print "Day of week: <name>" using
        // calendar.get(Calendar.DAY_OF_WEEK), then print "Time is before noon."
        // or "Time is after noon." using calendar.get(Calendar.AM_PM)
    }
}
