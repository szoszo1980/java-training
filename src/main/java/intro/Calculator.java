package intro;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Első szám:");
        int a = scanner.nextInt();

        System.out.println("Második szám:");
        int b = scanner.nextInt();

        System.out.println("Számok összege: " + a + " + " + b + " = " + (a + b));




    }
}
