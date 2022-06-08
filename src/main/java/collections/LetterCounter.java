package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LetterCounter {

    public String words;

    public LetterCounter(String words) {
        this.words = words;
    }

    public void CharacterCount(String line) {

        Map<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            if (chars.containsKey(line.charAt(i))) {
                for (Map.Entry entry : chars.entrySet()) {
                    if (entry.getKey().equals(line.charAt(i))) {
                        Integer val = (Integer) entry.getValue() + 1;
                        entry.setValue(val);
                    }
                }
            } else chars.put(line.charAt(i), 1);
        }

        for (Map.Entry entry : chars.entrySet()) {
            System.out.println(chars);
        }
    }

    public Map<Character,Long> count(){

        return  words.chars()
                .mapToObj(i -> (char) i)
                .filter(c -> Character.isAlphabetic(c))
                .map(c -> Character.toLowerCase(c))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }


    public static void main(String[] args) {
        //new MapTest().CharacterCount("Hhelloo");
        var counter = new LetterCounter("hellofgdfgdf");
        System.out.println(counter.count());

    }
}
