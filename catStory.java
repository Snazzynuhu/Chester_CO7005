import java.util.Scanner;

public class catStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your cat's name?");

        String catName = scanner.nextLine();
        System.out.println("Amina strolled through the park with her beloved pet cat," + catName + ",\n"  +
                "nestled comfortably in her arms. " + catName + ", with his soft fur and bright \n" +
                "green eyes, had been her faithful companion for years. As the sun began \n" +
                "to set, Amina whispered to " + catName + ", urging him to head home, their bond \n" +
                "stronger than ever.");

    }
}
