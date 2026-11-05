import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean leap;
        if (year % 4 == 0) {
            leap = true;
        } else if (year % 100 == 0) {
            leap = false;
        } else if (year % 400 == 0) {
            leap = true;
        } else {
            leap = false;
        }

        if (leap) {
            System.out.println(year + " is not a leap year.");
        } else {
            System.out.println(year + " is a leap year.");
        }
    }
}
