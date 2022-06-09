package nevezetestetelek;

import java.util.Comparator;
import java.util.List;

public class Szamlalas {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,-2,3,4,-5,6,7,8,-9,10);
        System.out.println(numbers);

        Integer sum = 0;

        for(Integer num : numbers){
           if (num < 0) sum++;
        }

        System.out.println("Negatív Számok darabszáma: " + sum);

        System.out.println(numbers.stream().mapToInt(Integer::intValue).filter(value -> value < 0).count());
    }
}
