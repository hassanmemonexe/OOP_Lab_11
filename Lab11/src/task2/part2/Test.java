package task2.part2;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.println("normal account interest rate: "  + (100 * bankAccount.getInterestRate()) + "%");
        System.out.println("savings account interest rate: "  + (100 * savingsAccount.getInterestRate()) + "%");
    }
}
