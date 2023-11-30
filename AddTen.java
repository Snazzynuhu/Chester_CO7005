import java.util.Scanner;

public class AddTen {
    public static void main(String[] args) {
         final int numberToAdd = 10;
        System.out.println("type in your number:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int sum = userInput + numberToAdd;
        System.out.println("Sum: "+ sum);
    }
}
