package AbstractInterface;

public class PaparaPayment implements DigitalWallet {

    private String mail;

    public PaparaPayment(String mail) {
        this.mail = mail;
    }

    @Override
    public void authenticate() {
        System.out.println("Papara Payment account is : " + mail);
    }

    @Override
    public void sendPayment(double amount) {
        System.out.println("Sending $" + amount + "Papara to" + mail);
    }
}

