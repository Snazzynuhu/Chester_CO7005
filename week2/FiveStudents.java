import java.util.Scanner;

public class FiveStudents {
    public static void main(String[] args) {
        int[] scores = new int[5];
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score for student number" + (i+1) + " (between 0 and 100): ");
            scores[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;
        
        System.out.println("\nResults:");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i+1) + " scored " + scores[i] + " - " + (scores[i] >= 50 ? "Pass" : "Fail"));
        }
        System.out.println("\nAverage Score: " + average);
    }
}
