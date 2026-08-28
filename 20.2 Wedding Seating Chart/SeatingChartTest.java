import java.io.FileNotFoundException;
import java.util.Scanner;

public class SeatingChartTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guest list filename: ");
        String filename = input.nextLine();
        System.out.println();

        SeatingEngine engine = new WeddingSeatingEngine();

        try {
            engine.loadGuestList(filename);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + filename);
            return;
        } catch (GuestListException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return;
        }

        System.out.println("Guests: " + engine.getGuestCount());
        System.out.println("Tables required: " + engine.getTableCount());
        System.out.println();
        System.out.print(engine);
        System.out.println();
        System.out.println("Valid seating chart: " + engine.isValidChart());
    }
}
