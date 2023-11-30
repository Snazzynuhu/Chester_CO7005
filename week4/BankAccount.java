import java.util.Scanner;

public class BankAccount {
    private String accountName;
    private double accountBalance;

    // getter
    public String getAccountName() { return this.accountName; };
    public double getAccountBalance() { return this.accountBalance; };
    // setter
    public void setAccountName(String name) { this.accountName = name; };
    public void setAccountBalance(double accountBalance) { this.accountBalance = accountBalance; };

    BankAccount(String accountName, double accountBalance){
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    double deposit(double amount){
        return accountBalance += amount;
    }
    double withdrawal(double amount){
        return accountBalance -= amount;
    }
    double showAccountBalance(){
        return this.accountBalance;
    }

    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount("Tunde Martin", 1500);
        System.out.println("Welcome "+ customer1.getAccountName()+ '!');
        System.out.println("What do you want to do today?");
        System.out.println("To deposit enter 1; To withdraw enter 2;  To view your balance enter 3");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
    
        if(userInput == 1){
            System.out.print("Enter the amount you wish to deposit: ");
            double depositAmount = scanner.nextDouble();
            customer1.deposit(depositAmount);
            System.out.println("You have successfully deposited "+ depositAmount);
            System.out.println("Your current balance is \u00A3" + customer1.showAccountBalance());
        }
        if(userInput == 2){
             System.out.print("Enter the amount you wish to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            customer1.withdrawal(withdrawAmount);
            System.out.println("You have successfully withdrew "+ withdrawAmount);
            System.out.println("Your current balance is \u00A3" + customer1.showAccountBalance());
        }
        if(userInput == 3){
            System.out.println("Your current balance is \u00A3"+customer1.showAccountBalance());
        }



        scanner.close();
        
    }


    
}
