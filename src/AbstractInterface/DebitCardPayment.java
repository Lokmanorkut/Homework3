package AbstractInterface;

public class DebitCardPayment extends CardPayment {

    public DebitCardPayment(String cardNumber, String cardHolderName) {
        super(cardNumber, cardHolderName);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Debit Card Payment: " + amount + "$" + "for" + cardHolderName);


    }
}
