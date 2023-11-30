import java.util.Scanner;

public class CestrianInsurance {
    public static void main(String[] args) {

        int carBasePremium = 305;
        int motorcycleBasePremium = 360;
        //int percentageIncrementForYoungerCustomers = 30;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the type of vehicle (car or motorcycle): ");
        String vehicleType = userInput.nextLine().toLowerCase();

        System.out.print("Enter the customer's age: ");
        int age = userInput.nextInt();

        System.out.print("Enter the number of penalty points: ");
        int penaltyPoints = userInput.nextInt();

        double premiumToPay = 0;

        if (vehicleType.equals("car")) {
            premiumToPay = carBasePremium;
        } else if (vehicleType.equals("motorcycle")) {
            premiumToPay = motorcycleBasePremium;
        } else {
            System.out.println("Invalid vehicle type. Please enter 'car' or 'motorcycle'.");
            userInput.close();
            return;
        }

        if (age < 25) {

            premiumToPay  +=  (0.3 * premiumToPay);
        }
        if (penaltyPoints > 6) {

            premiumToPay += 100;
        }

        System.out.println("Total premium payable: \u00A3" + premiumToPay);
        userInput.close();
    }
}
