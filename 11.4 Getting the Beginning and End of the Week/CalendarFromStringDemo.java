import java.util.Calendar;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CalendarFromStringDemo {

    public static Calendar getCalendarFromString(String dateString)
            throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(dateString));
        return calendar;
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date in MM/dd/yyyy format: ");
        String dateString = scanner.nextLine();

        Calendar calendar = getCalendarFromString(dateString);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Calendar date: " + sdf.format(calendar.getTime()));
    }
}
