import java.util.Scanner;

public class CustomerChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a amount: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Enter a value greater that zero");
            scanner.close();
            return;
        }

        int[] denominations = {5000, 2000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

        int totalPence = (int) (amount * 100);

        System.out.println("Minimum number of currency notes and coins needed:");

        for (int i=0; i < denominations.length; i++) {
            int count = totalPence / denominations[i];
            if (count > 0) {
                totalPence %= denominations[i];
                if (denominations[i] >= 100) {
                    System.out.println("£" + denominations[i] / 100 + " notes: " + count);
                } else {
                    System.out.println(denominations[i] + " pence coins: " + count);
                }
            }
        }
        scanner.close();
    }
}
