import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class CalendarAddDemo {

    public static Calendar getCalendar(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);
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

        Calendar calendar = getCalendar(day, month, year);
        Calendar plus7 = (Calendar) calendar.clone();
        plus7.add(Calendar.DATE, 7);
        Calendar minus7 = (Calendar) calendar.clone();
        minus7.add(Calendar.DATE, -7);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Original date: " + sdf.format(calendar.getTime()));
        System.out.println("Date + 7 days: " + sdf.format(plus7.getTime()));
        System.out.println("Date - 7 days: " + sdf.format(minus7.getTime()));
    }
}
