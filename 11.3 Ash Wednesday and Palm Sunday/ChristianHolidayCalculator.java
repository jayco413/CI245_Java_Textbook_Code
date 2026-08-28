import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class ChristianHolidayCalculator {

    public static Calendar getEaster(int year) {
        // ADD YOUR CODE HERE
        return null;
    }

    public static Calendar getAshWednesday(int year) {
        // ADD YOUR CODE HERE
        return null;
    }

    public static Calendar getPalmSunday(int year) {
        // ADD YOUR CODE HERE
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        Calendar easter = getEaster(year);
        Calendar ashWednesday = getAshWednesday(year);
        Calendar palmSunday = getPalmSunday(year);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        String formattedEaster = sdf.format(easter.getTime());
        String formattedAshWednesday = sdf.format(ashWednesday.getTime());
        String formattedPalmSunday = sdf.format(palmSunday.getTime());

        System.out.println("Easter Sunday: " + formattedEaster);
        System.out.println("Ash Wednesday: " + formattedAshWednesday);
        System.out.println("Palm Sunday: " + formattedPalmSunday);
    }
}
