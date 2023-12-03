import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FavouriteFoods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the text file: ");
        String fileName = scanner.nextLine();

        List<String> favoriteFoods = new ArrayList<String>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your favorite food #" + (i + 1) + ": ");
            favoriteFoods.add(scanner.nextLine());
        }

        try {
            Files.write(Paths.get(fileName), favoriteFoods);
            System.out.println("Favorite foods written to the file successfully.");

            List<String> updatedFoods = Files.readAllLines(Paths.get(fileName));

            // Append two more favorite foods
            for (int i = 0; i < 2; i++) {
                System.out.print("Enter "+ ( (2 - i) == 2? "two ": "one " )+ "more favorite foods\n");
                System.out.print("Food #" + (i+4) + ": ");
                updatedFoods.add(scanner.nextLine());
            }

            // Write the updated list back to the file
            Files.write(Paths.get(fileName), updatedFoods);
            System.out.println("Two more favorite foods added to the file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while processing the file: " + e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}
