import java.util.Scanner;

public class Temperature {
    
    public void celcius()
    {
        System.out.print("Enter a temperature in Fahrenheit: ");
        Scanner fahrenheitInput = new Scanner(System.in);
        double fahrenheit = fahrenheitInput.nextDouble();
        double celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in Celcius is " + celcius);
        fahrenheitInput.close();
    }

    public void fahrenheit()
    {
        System.out.print("Enter a temperature in Celcius: ");
        Scanner celciusInput = new Scanner(System.in);
        double celcius = celciusInput.nextDouble();
        double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
        celciusInput.close();
    }
}
