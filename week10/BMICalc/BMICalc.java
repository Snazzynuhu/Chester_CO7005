package BMICalc;
import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        float weight = scanner.nextFloat();

        System.out.print("Enter your height in meters: ");
        float height = scanner.nextFloat();
        scanner.close();

        double bmi = calculateBMI(weight, height);

        System.out.println("Your BMI is: " + bmi);
    }
    

    public static double calculateBMI(float weight, float height) {
        return weight / (height * height);
    }
   
}

