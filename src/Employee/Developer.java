package Employee;

public class Developer extends Employee {
    private String about;

    @Override
    public double calculateBonus() {
        return getSalary() * 0.1;
    }
}
