public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }
    public static void modifyInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public void SavingsAccountTest() {
        SavingsAccount Saver1 = new SavingsAccount(2000);
        SavingsAccount Saver2 = new SavingsAccount(3000);
        annualInterestRate = 0.04;
        System.out.println("Saver 1 starts with $" + Saver1.getSavingsBalance());
        System.out.println("Saver 2 starts with $" + Saver2.getSavingsBalance());
        System.out.println("The annual interest rate is " + annualInterestRate + "%");
        System.out.println("For the next year, the balance at the end of each month for Saver 1 is:");
        for (int i = 1; i <= 12; i++) {
            Saver1.calculateMonthlyInterest();
            System.out.printf("Month %d balance is %.2f%n", i, Saver1.getSavingsBalance());
        }
        System.out.println("For the next year, the balance at the end of each month for Saver 2 is:");
        for (int i = 1; i <= 12; i++) {
            Saver2.calculateMonthlyInterest();
            System.out.printf("Month %d balance is %.2f%n", i, Saver2.getSavingsBalance());
        }
    }
}