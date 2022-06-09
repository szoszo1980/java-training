package functional;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LetterHistogram {

    public static void main(String[] args) {
        String text = "klégkédflgkéditzrortzlkhléfghrtueriotuioertujioertertúűASPŐAúspaősa";

        var histogram = text.chars()
                .parallel()
                .mapToObj(i-> (char)i)
                .filter(Character::isAlphabetic)
                .map(c -> Character.toString(c))
                .collect(Collectors.toConcurrentMap(// toMap(
                        c ->c,// kulcs legyen önmaga
                        c -> 1,// érték kezdeti értéke legyen 1
                        (i,c) -> i+1 //ha már vamn a map-ben érték akkor növelje
                        //() -> new TreeMap<>(Collator.getInstance(new Locale("hu","HU")))
                ))
                .entrySet()
                .stream()
                .parallel()
                //.sorted(Comparator.comparingInt(Map.Entry::getValue))
                .sorted(Comparator.comparingInt(Map.Entry<String,Integer>::getValue).reversed())
                .map(e -> e.getValue() + " - " + e.getKey())
                .collect(Collectors.joining(", "));

        System.out.println(histogram);
    }
}
