import java.util.Scanner;

public class EmployeeTest {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        // Instantiate Employee 1
        Employee e1 = new Employee(); // default constructor

        // User input for Employee 2
        System.out.print("\nEnter your first name: ");
        String firstName = s.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = s.nextLine();
        System.out.print("Enter your monthly salary as a decimal: ");
        double monthlySalary = s.nextDouble();

        // Instantiate Employee 2
        Employee e2 = new Employee(firstName, lastName, monthlySalary); // constructor with parameters

        // Print out Employee 1's info
        System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%n","[Employee 1]", "First Name: " + e1.getFirstName(), "Last Name: " + e1.getLastName(), "Monthly Salary: " + e1.getmSalary(), "Yearly Salary: " + e1.yearlySalary());

        // Print out Employee 2's info
        System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%n","[Employee 2]", "First Name: " + e2.getFirstName(), "Last Name: " + e2.getLastName(), "Monthly Salary: " + e2.getmSalary(), "Yearly Salary: " + e2.yearlySalary());

        // Give Employees a raise
        e1.giveRaise(e1.getmSalary());
        e2.giveRaise(e2.getmSalary());

        // Display both Employees' new salaries
        System.out.println("\nIf each employee was given a 10% raise, their new yearly salaries would be: ");
        System.out.printf("%s%n%s%n%n","[Employee 1]", e1.fName + " " + e1.yearlySalary());
        System.out.printf("%s%n%s%n%n","[Employee 2]", e2.fName + " " + e2.yearlySalary());
        s.close();
    }
}
