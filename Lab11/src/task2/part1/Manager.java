package task2.part1;

public class Manager extends Employee{
    @Override
    public double calculateSalary() {
        return (3 * super.calculateSalary());
    }
}
