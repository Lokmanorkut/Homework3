package AbstractInterface;

import javax.smartcardio.Card;

public class Main {
    public static void main(String[] args) {

        //Abstract Örneği

        Dog dog = new Dog("Alex");
        Animal cat = new Cat("Duman");
        dog.makeSound();
        dog.eat();
        cat.makeSound();
        cat.eat();


        //Interface Örneği

        Drivable car = new Car();
        Drivable bicycle = new Bicycle();

        car.start();
        car.stop();

        bicycle.start();
        bicycle.stop();


        //2.Örnek

        CardPayment creditCard = new CreditCardPayment("1234-5678-9101", "Harun");

        creditCard.validateCard();
        creditCard.pay(100.0);

        System.out.println("_______");


        CardPayment debitCard = new DebitCardPayment("1234-1212-9101", "Mustafa");
        debitCard.pay(50.0);

        System.out.println("_______");


        PaparaPayment papara = new PaparaPayment("harun06@gmail.com");

        papara.authenticate();
        papara.sendPayment(77.0);


    }
}
