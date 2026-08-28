import java.util.Calendar;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class WeekCalculator {

    public static Calendar getCalendarFromString(String dateString)
            throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(dateString));
        return calendar;
    }

    public static Calendar getBeginningOfWeek(Calendar calendar) {
        // ADD YOUR CODE HERE
        return null;
    }

    public static Calendar getEndOfWeek(Calendar calendar) {
        // ADD YOUR CODE HERE
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(
                "Enter the date in MM/dd/yyyy format (q to quit): ");
            String dateString = scanner.nextLine();

            if (dateString.equals("q")) {
                break;
            }

            System.out.println();

            try {
                Calendar calendar = getCalendarFromString(dateString);
                Calendar beginningOfWeek = getBeginningOfWeek(calendar);
                Calendar endOfWeek = getEndOfWeek(calendar);

                SimpleDateFormat sdf
                    = new SimpleDateFormat("EEEE, MMMM d, yyyy");

                String formattedDate = sdf.format(calendar.getTime());
                String formattedBeginningOfWeek
                    = sdf.format(beginningOfWeek.getTime());
                String formattedEndOfWeek = sdf.format(endOfWeek.getTime());

                System.out.println("Input date: " + formattedDate);
                System.out.println();
                System.out.println("Beginning of week: "
                    + formattedBeginningOfWeek);
                System.out.println("End of week: " + formattedEndOfWeek);
            } catch (ParseException e) {
                System.out.println("Error parsing date: " + e.getMessage());
            }
            System.out.println();
        }
    }
}
