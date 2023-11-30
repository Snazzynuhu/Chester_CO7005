import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of £10 notes: ");
        int numTenPoundNotes = scanner.nextInt();

        System.out.print("Enter the number of £20 notes: ");
        int numTwentyPoundNotes = scanner.nextInt();

        System.out.print("Enter the number of £50 notes: ");
        int numFiftyPoundNotes = scanner.nextInt();
        scanner.close();
        int totalNotes = numTenPoundNotes + numTwentyPoundNotes + numFiftyPoundNotes;
        int totalAmount = (numTenPoundNotes * 10) + (numTwentyPoundNotes * 20) + (numFiftyPoundNotes * 50);
        
        System.out.println("\nSummary:");
        System.out.println("£10 Notes: \t " + numTenPoundNotes);
        System.out.println("£20 Notes: \t " + numTwentyPoundNotes);
        System.out.println("£50 Notes: \t " + numFiftyPoundNotes);
        System.out.println("Total Notes: \t " + totalNotes);
        System.out.println("Total Amount: \u00A3" + totalAmount);
    }
}
