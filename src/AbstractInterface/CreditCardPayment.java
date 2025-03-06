package AbstractInterface;

public class CreditCardPayment extends CardPayment {

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        super(cardNumber, cardHolderName);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment: " + amount + "$" + "for" + cardHolderName);

    }
}
