package AbstractInterface;

public class Car implements Drivable {
    @Override
    public void start() {
        System.out.println("Car is starting.......");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");

    }
}
