package detailed;

public class Literals {

    public Literals(Long id){
        System.out.println(id);
    }
    public static void main(String[] args) {
        var i = 12;
        long l = i;

        new Literals(12L);

        int a = Integer.parseInt("123");

        double b = Double.parseDouble("123.12");

        String s =Integer.toString(12);

    }
}
