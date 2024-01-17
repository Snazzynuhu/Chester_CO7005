import java.util.Arrays;
import java.util.Random;

public class NumberSort {
    public static void main(String[] args) {
        int[] numbers = generateRandomArray(25);

       System.out.println("Before Sorting: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println();
        System.out.println("After Sorting: " + Arrays.toString(numbers));
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

}
