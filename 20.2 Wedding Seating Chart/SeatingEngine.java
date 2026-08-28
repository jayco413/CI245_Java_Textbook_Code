import java.io.FileNotFoundException;
import java.util.ArrayList;

public abstract class SeatingEngine {

    public static final int SEATS_PER_TABLE = 5;
    public static final int MAX_GUESTS = 75;

    public abstract void loadGuestList(String filename)
        throws FileNotFoundException, GuestListException;

    public abstract int getGuestCount();

    public abstract boolean hates(int guestA, int guestB);

    public abstract ArrayList<ArrayList<Integer>> getSeatingChart();

    public int getTableCount() {
        return getSeatingChart().size();
    }

    public boolean isValidChart() {
        ArrayList<ArrayList<Integer>> chart = getSeatingChart();
        boolean[] seated = new boolean[getGuestCount() + 1];
        int previousLowest = 0;
        for (ArrayList<Integer> table : chart) {
            if (table.isEmpty() || table.size() > SEATS_PER_TABLE) {
                return false;
            }
            if (table.get(0) < previousLowest) {
                return false;
            }
            previousLowest = table.get(0);
            for (int i = 0; i < table.size(); i++) {
                int guest = table.get(i);
                if (guest < 1 || guest > getGuestCount() || seated[guest]) {
                    return false;
                }
                seated[guest] = true;
                for (int j = i + 1; j < table.size(); j++) {
                    if (table.get(j) <= guest || hates(guest, table.get(j))) {
                        return false;
                    }
                }
            }
        }
        for (int guest = 1; guest <= getGuestCount(); guest++) {
            if (!seated[guest]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder chartText = new StringBuilder();
        ArrayList<ArrayList<Integer>> chart = getSeatingChart();
        for (int t = 0; t < chart.size(); t++) {
            chartText.append("Table ").append(t + 1).append(":");
            for (int guest : chart.get(t)) {
                chartText.append(" ").append(guest);
            }
            chartText.append(System.lineSeparator());
        }
        return chartText.toString();
    }
}
