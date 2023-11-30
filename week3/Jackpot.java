import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;

public class Jackpot {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please choose six numbers between 1 and 49: ");
        
        HashSet<Integer> userNumbers = new HashSet<>();
        
        while (userNumbers.size() < 6) {
            int number = userInput.nextInt();

            if (number < 1 || number > 49) {
                System.out.println("Invalid input. Please enter a number between 1 and 49.");
            } else if (userNumbers.contains(number)) {
                System.out.println("You already chose that number. Please choose a different one.");
            } else {
                userNumbers.add(number);
            }
        }
        
        Random random = new Random();
        HashSet<Integer> drawnNumbers = new HashSet<>();
        
        while (drawnNumbers.size() < 6) {
            int number = random.nextInt(49) + 1;
            drawnNumbers.add(number);
        }
        
        System.out.println("User's Numbers: " + userNumbers);
        System.out.println("Drawn Numbers: " + drawnNumbers);
        
        int totalMatchingNumbers = 0;

        for (int number : userNumbers) {
            if (drawnNumbers.contains(number)) {
                totalMatchingNumbers++;
            }
        }
        
        switch (totalMatchingNumbers) {
            case 3:
                System.out.println("\nCongratulations! You matched 3 numbers. You won £50!");
                break;
            case 4:
                System.out.println("\nCongratulations! You matched 4 numbers. You won £25,000!");
                break;
            case 5:
                System.out.println("\nCongratulations! You matched 5 numbers. You won £120,000!");
                break;
            case 6:
                System.out.println("\nCongratulations! You matched all 6 numbers. You won £2,400,000 (Jackpot)!");
                break;
            default:
                System.out.println("\nSorry, you didn't win this time. Better luck next time!");
        }
        
        userInput.close();
    }
}
