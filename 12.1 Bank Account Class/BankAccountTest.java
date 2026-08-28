public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1001, 1000.00);
        BankAccount account2 = new BankAccount(1002, 500.00);

        System.out.println("Initial balances:");
        System.out.printf("Account 1: $%.2f%n", account1.getBalance());
        System.out.printf("Account 2: $%.2f%n", account2.getBalance());
        System.out.println();

        account1.deposit(500.00);
        account2.withdraw(100.00);
        System.out.println("Balances after transactions:");
        System.out.printf("Account 1: $%.2f%n", account1.getBalance());
        System.out.printf("Account 2: $%.2f%n", account2.getBalance());
        System.out.println();

        account1.transfer(account2, 200.00);
        System.out.println("Balances after transfer:");
        System.out.printf("Account 1: $%.2f%n", account1.getBalance());
        System.out.printf("Account 2: $%.2f%n", account2.getBalance());
        System.out.println();

        account1.applyInterest();
        account2.applyInterest();
        System.out.println("Balances after applying interest:");
        System.out.printf("Account 1: $%.2f%n", account1.getBalance());
        System.out.printf("Account 2: $%.2f%n", account2.getBalance());
        System.out.println();

        System.out.printf(
            "Account 1 balance in another currency: $%.2f%n%n",
            account1.balanceInCurrency(0.9));

        BankAccount.setInterestRate(0.03);
        account1.applyInterest();
        account2.applyInterest();
        System.out.println("Balances after applying new interest rate:");
        System.out.printf("Account 1: $%.2f%n", account1.getBalance());
        System.out.printf("Account 2: $%.2f%n", account2.getBalance());
    }
}
