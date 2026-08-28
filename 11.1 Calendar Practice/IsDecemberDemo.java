import java.util.Calendar;

public class IsDecemberDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(isDecember(calendar));
    }

    public static boolean isDecember(Calendar calendar) {
        int month = calendar.get(Calendar.MONTH);
        return month == Calendar.DECEMBER;
    }
}
