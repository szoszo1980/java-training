package strings;

public class StringMain {
    public static void main(String[] args) {
        String first = "Apple";
        String second = "Apple";

        System.out.println(first == second);

        char[] chars = new char[5];

        for(int i = 0;i<5;i++){
            chars[i] = (char)('a' + i);

        }

        String letters = new String(chars);

        System.out.println(letters);
        System.out.println(letters == "abcde");
        System.out.println(letters.equals("abcde"));

        String part1 = "abc";
        String part2 = "de";
        String parts = part1 + part2;
        System.out.println("equals? " + (letters == parts));

        String parts2 = "abc" + "de";
        System.out.println(parts2 == "abcde");

        String parts3 = parts.intern();//poll-ból adja vissza ha nincs benne belerakja így csak egyszerfordul elő a memóriában
        System.out.println(parts3 == "abcde");



    }
}
