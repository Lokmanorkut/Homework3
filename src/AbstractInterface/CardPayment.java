package AbstractInterface;

public abstract class CardPayment {
    protected String cardNumber;
    protected String cardHolderName;

    public CardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }


    public abstract void pay(double amount);

    public void validateCard(){
        System.out.println("Validate Card Number: " + cardNumber);
    }
}
