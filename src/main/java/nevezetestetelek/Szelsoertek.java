package nevezetestetelek;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Szelsoertek {
    public static void main(String[] args) {
        //Hozzatok létre szavak listáját, és keressétek ki a leghosszabb szót!

        List<String> words = new ArrayList<>(List.of("első", "második", "harmadik", "negyedik"));

        System.out.println(words);

        Integer wLength = words.get(0).length();
        String tmp = words.get(0);

        for (String word : words) {
            if (wLength < word.length()) {
                wLength = word.length();
                tmp = word;
            }
        }

        System.out.println("Leghosszabb szó: " + tmp);

        System.out.println(words.stream().min(Comparator.comparingInt(String::length)).get());
        System.out.println(words.stream().max(Comparator.comparingInt(String::length)).get());
    }
}
