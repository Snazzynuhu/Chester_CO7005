public class EvenTwenty {
    public static void main(String[] args) {
        for(int i=2; i <= 20; i++){
            while(i%2 == 0){
                System.out.println("Even number: " + i);
                i++;
            }
        }
        System.out.println("Done");
        
    }
    
}


