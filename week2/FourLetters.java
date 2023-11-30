import java.util.Scanner;

public class FourLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-letter word: ");
        String userInput = scanner.nextLine();
        scanner.close();

        if (userInput.length() != 4) {
            System.out.println("Please enter a four-letter word.");
            return;
        }

        char[] letters = userInput.toCharArray();

        System.out.println("The letters of the word are:");
        for (char letter : letters) {
            System.out.println(letter);
        }
    }
}
