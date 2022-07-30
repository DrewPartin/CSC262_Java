import java.util.Scanner;

public class BMICalculator {

    static double CalculateBMI() {
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter your weight in lbs: ");
        double weight = s2.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = s2.nextDouble();
        double bmi = (weight * 703) / (height * height);
        s2.close();
        return bmi;
    }

    static String BMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("\nEnter your name: ");
        String name = s1.nextLine();
        double _bmi = CalculateBMI();
        String _bmiCategory = BMICategory(_bmi);
        System.out.print("\nHello " + name + ", your BMI is: " + _bmi + ". You are " + _bmiCategory + ".\n\n");
        s1.close();
    }
}
