package Employee;

public class Manager extends Employee {
    private int teamSize;

    @Override
    public double calculateBonus() {
        return getSalary() * 0.2;
    }
}
