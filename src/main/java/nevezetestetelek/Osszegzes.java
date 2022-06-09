package nevezetestetelek;

import java.util.List;

public class Osszegzes {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbers);

        Integer sum = 0;

        for(Integer num : numbers){
           sum = sum + num;
        }

        System.out.println("Számok összege: " + sum);


        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());

    }
}
