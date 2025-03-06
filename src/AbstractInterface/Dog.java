package AbstractInterface;

public class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println(name + " Hav hav ");
    }

    @Override
    void eat() {
        System.out.println(name + " is eating bone.");
    }


}
