import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter height of container");
        int height = userInput.nextInt();
        System.out.println("Enter radius of container");
        int radius = userInput.nextInt();

        System.out.println("Calculated volume is: "+ calculateVolume(height, radius));
        userInput.close();
    }
    static double calculateVolume(double height, double radius) {
        return (Math.PI * Math.pow(radius, 2))*height;
    }
    
}
