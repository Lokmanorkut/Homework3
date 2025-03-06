package BankAccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return (getBalance() * 5) / 100;
    }

    ;
}
