import java.util.Scanner;

public class TwoNumberMath {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int division = firstNumber / secondNumber;
        int product = firstNumber * secondNumber;
        System.out.println( firstNumber+  "+" +secondNumber +"="  + sum);
        System.out.println( firstNumber+  "-" +secondNumber +"="  + subtraction);
        System.out.println( firstNumber+  "/" +secondNumber +"="  + division);
        System.out.println( firstNumber+  "*" +secondNumber +"="  + product);
    }
}
