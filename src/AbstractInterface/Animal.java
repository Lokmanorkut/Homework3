package AbstractInterface;

public abstract class Animal {
    String name;


    abstract void makeSound();

    void eat() {
        System.out.println(name + " is eating right now.");
    }
}
