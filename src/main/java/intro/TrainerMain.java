package intro;

public class TrainerMain {
    public static void main(String[] args) {

        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";

        Trainer john = new Trainer("John Doe",1980);
        //john.setName("John Doe");
        //john.setYearOfBirth(1980);

        System.out.println(john.getNameAndYearOfBirth());
        System.out.println(john.getAge(2022));

        System.out.println(red);
        System.out.println(john.getName());
        System.out.println(john.getYearOfBirth());

        Trainer jack =new Trainer("Jack Doe",1990);
        //jack.setName("Jack Doe");
        //jack.setYearOfBirth(1990);

        System.out.println(jack.getNameAndYearOfBirth());
        System.out.println(jack.getAge(2022));


        System.out.println(green);
        System.out.printf("%s year of birth: %d",jack.getName(),jack.getYearOfBirth());

        System.out.println(reset);

        Trainer anonym = new Trainer();

    }
}
