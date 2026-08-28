public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(12345, 1000);

        System.out.printf("Initial balance: $%.2f\n", myAccount.getBalance());

        myAccount.deposit(200);
        System.out.printf("Balance after deposit: $%.2f\n", myAccount.getBalance());

        myAccount.withdraw(100);
        System.out.printf("Balance after withdrawal: $%.2f\n", myAccount.getBalance());

        myAccount.applyInterest();
        System.out.printf("Balance after interest: $%.2f\n", myAccount.getBalance());
    }
}
