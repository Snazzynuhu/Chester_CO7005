import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface RandFib {

    Set<Integer> UNIQUE_NUMBERS = new HashSet<>(Set.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55));

    public static void main(String[] args) {
      generate();  
    }
    static int generate() {
          int size = UNIQUE_NUMBERS.size();
          int item = (int) (Math.random() * size);
          System.out.println("ITEM: "+ item);
          
          List<Integer> list = List.copyOf(UNIQUE_NUMBERS);
          return list.get(item);
      }

    
}
