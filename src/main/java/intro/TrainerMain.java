package intro;

public class TrainerMain {
    public static void main(String[] args) {

        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";

        Trainer john = new Trainer();
        john.name = "John Doe";
        john.yearOfBirth = 1980;

        System.out.println(red);
        System.out.println(john.name);
        System.out.println(john.yearOfBirth);

        Trainer jack =new Trainer();
        jack.name ="Jack Doe";
        jack.yearOfBirth = 1990;

        System.out.println(green);
        System.out.printf("%s year of birth: %d",jack.name,jack.yearOfBirth);

        Trainer jack2 =new Trainer();

        System.out.printf("\n\n%s year of birth: %d",jack2.name,jack2.yearOfBirth);
        System.out.println(reset);
    }
}
