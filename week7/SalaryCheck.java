import java.util.Scanner;

public class SalaryCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter your gross annual salary: ");
                int salary = scanner.nextInt();

                if (salary > 0) {
                    System.out.println("Valid salary entered: " + salary);
                    break; 
                } else {
                    System.out.println("Invalid input. Salary must be a greater than 0. Please try again.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter a valid positive integer.");
            }
        }

        scanner.close();
    }
}
