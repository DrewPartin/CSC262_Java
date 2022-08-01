import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an application to run: ");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1. Square of Chars", "2. Temperature Conversions", "3. Play Craps", "4. Craps Statistics", "5. Sieve of Eratosthenes", "6. Savings Account", "7. Exit");
        int appId = sc.nextInt();
        switch (appId) {
            case 1:
                SquareOfChars squareOfChars = new SquareOfChars();
                squareOfChars.squareOfChars(4, '*');
                break;
            case 2:
                Temperature temperature = new Temperature();
                System.out.print("1: Celcius to Fahrenheit\n2: Fahrenheit to Celcius\n");
                Scanner choiceInput = new Scanner(System.in);
                int choice = choiceInput.nextInt();
                if (choice == 1) { temperature.fahrenheit(); }
                else if (choice == 2) { temperature.celcius(); }
                else { System.out.println("Invalid choice"); }
                choiceInput.close();
                break;
            case 3:
                Craps craps = new Craps();
                craps.Play();
                break;
            case 4:
                CrapsStats crapsStats = new CrapsStats();
                for (int i = 0; i < 1000000; i++) {
                    crapsStats.Play();
                }
                crapsStats.printStats();
                break;
            case 5:
                Sieve sieve = new Sieve();
                sieve.primeFinder();
                break;
            case 6:
                SavingsAccount savingsAccount = new SavingsAccount(0);
                savingsAccount.SavingsAccountTest();
                break;
            case 7:
                System.out.println("Goodbye!");
                break;
        }  
        sc.close();     
    }
}