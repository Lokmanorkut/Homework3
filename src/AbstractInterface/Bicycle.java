package AbstractInterface;

public class Bicycle implements Drivable {

    @Override
    public void start() {
        System.out.println("Bicycle's pedals are turned.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle's pedals are not turned right now.");
    }
}
