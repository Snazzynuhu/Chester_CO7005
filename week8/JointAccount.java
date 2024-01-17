public class JointAccount {
    private static int balance = 1000; 

    public static void main(String[] args) {
        JointAccount jointAccount = new JointAccount();

        Thread person1Thread = new Thread(() -> jointAccount.performTransactions("Person 1"));
        Thread person2Thread = new Thread(() -> jointAccount.performTransactions("Person 2"));

        person1Thread.start();
        person2Thread.start();

        try {
            person1Thread.join();
            person2Thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Bank Balance: \u00A3" + balance);
    }

    // Method to perform transactions
    private synchronized void performTransactions(String person) {
        for (int i = 0; i < 5; i++) {
            // Simulate five transactions with different amount between 1 and 100
            int amount = (int) (Math.random() * 100) + 1; 

            if (i % 2 == 0) {
                balance += amount;
                System.out.println(person + " deposited \u00A3" + amount + ". New balance: \u00A3" + balance);
            } else {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println(person + " withdrew \u00A3" + amount + ". New balance: \u00A3" + balance);
                } else {
                    System.out.println(person + " tried to withdraw \u00A3" + amount +
                            " but insufficient funds. Balance: \u00A3" + balance);
                }
            }

            try {

                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
