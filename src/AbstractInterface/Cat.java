package AbstractInterface;

public class Cat extends Animal {
    Cat(String name) {
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println(name + " Miyavv");
    }

    @Override
    void eat() {
        System.out.println(name+" is eating fish.");
    }

}
