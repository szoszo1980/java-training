package nevezetestetelek;

import java.util.List;

public class Eldontes {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers);

        boolean even = false;
        boolean odd = false;

        for (Integer num : numbers) {
            if ((num % 2) == 0) {
                even = true;
            } else odd = true;
        }

        if (even && odd) {
            System.out.println("A lista: páros ás páratlan számokat is tartalmaz");
        } else if (even) {
            System.out.println("A lista: páros számokat tartalmaz");
        } else {
            System.out.println("A lista: páratlan számokat tartalmaz");
        }

        System.out.println(numbers.stream().allMatch(s -> (s % 2) == 0));
    }
}
