public class BankAccount {

    private static double interestRate = 0.05;
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        balance = initialBalance > 0 ? initialBalance : 0;
    }

    public void deposit(double amount) {
        if (validateAmount(amount)) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (validateAmount(amount) && balance >= amount) {
            balance -= amount;
        }
    }

    public void transfer(BankAccount targetAccount, double amount) {
        if (validateAmount(amount) && balance >= amount) {
            withdraw(amount);
            targetAccount.deposit(amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double balanceInCurrency(double exchangeRate) {
        return balance * exchangeRate;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }

    private boolean validateAmount(double amount) {
        return amount > 0;
    }
}
