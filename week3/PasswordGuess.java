import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        final String password = "open-sesame";
        System.out.println("Please enter your guess for the password:");
        Scanner userInput = new Scanner(System.in);
        do {
            if (userInput.nextLine().equalsIgnoreCase(password)) {
                System.out.println("Correct! You have entered the correct password.");
                break;
            } else {
                System.out.println("Incorrect password, please try again!");
            }
        } while (true);
        userInput.close();
    }

}
