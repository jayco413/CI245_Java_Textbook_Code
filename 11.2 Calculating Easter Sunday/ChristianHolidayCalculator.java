import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class ChristianHolidayCalculator {

    public static Calendar getEaster(int year) {
        // ADD YOUR CODE HERE
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        Calendar calendar = getEaster(year);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        String formattedDate = sdf.format(calendar.getTime());
        System.out.println("Easter Sunday: " + formattedDate);
    }
}
