import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

        double value = 123.4567;
        String formattedValue = currencyFormat.format(value);
        System.out.println(formattedValue);

        currencyFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        formattedValue = currencyFormat.format(value);
        System.out.println(formattedValue);

        Locale defaultLocale = Locale.getDefault();
        System.out.println("Default locale: " + defaultLocale);

        currencyFormat = NumberFormat.getCurrencyInstance();
        formattedValue = currencyFormat.format(value);
        System.out.println(formattedValue);
    }
}
