public class Backwards {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 1, 2, 3, 5, 8, 13};

        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nArray in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
