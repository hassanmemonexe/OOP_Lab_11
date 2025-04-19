package task2.part1;

public class Worker extends Employee{
    public double calculateSalary(){
        return (1.5 * super.calculateSalary());
    }
}
