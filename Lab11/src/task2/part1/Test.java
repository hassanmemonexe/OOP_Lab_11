package task2.part1;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Worker worker = new Worker();
        Manager manager = new Manager();
        System.out.println("Employee salary: " + employee.calculateSalary());
        System.out.println("Worker salary: " + worker.calculateSalary());
        System.out.println("Manager salary: " + manager.calculateSalary());
    }
}
