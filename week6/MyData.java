public class MyData implements MinMax {

    @Override
    public int min(int[] numbersArr) {
        int min = numbersArr[0];
       for(int number : numbersArr) {
        if (min > number){
            min = number;
        }
       }
    return min;
    }

    @Override
    public int max(int[] numbersArr) {
      int max = numbersArr[0];
       for(int number : numbersArr) {
        if (max < number){
            max = number;
        }
       }
    return max;
    }

    static int[] sampleArray = {1,2,-10,6,8,33};
    
    public static void main(String[] args) {
        System.out.println("Minimum value is: " + new MyData().min(sampleArray));
        System.out.println("Maximum value is: " + new MyData().max(sampleArray));
    }
}
