package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount savingAccount = new SavingsAccount("Musa ", 1000);
        BankAccount checkingAccount = new CheckingAccount("Ömer ", 15000);

        System.out.println(savingAccount.calculateInterest());

        checkingAccount.calculateInterest();

    }
}
