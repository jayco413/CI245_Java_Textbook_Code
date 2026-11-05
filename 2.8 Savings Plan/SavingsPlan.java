public class SavingsPlan {
    public static void main(String[] args) {
        double deposit = 100.00;
        double balance = 0;
        double monthlyRate = 0.06 / 12;

        for (int month = 1; month <= 120; month++) {
            if (month % 12 == 0) {
                deposit = deposit * 1.03;
            }
            balance = balance * (1 + monthlyRate);
            balance = balance + deposit;

            if (month % 12 == 0) {
                System.out.printf("Year %d: deposit %.2f, balance %.2f\n",
                    month, deposit, balance);
            }
        }
    }
}
