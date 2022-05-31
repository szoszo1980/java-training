package bookshelfapp;

import java.util.Scanner;

public class Cotroller {

    private Scanner sc = new Scanner(System.in);
    private BookShelf bookshelf = new BookShelf();
    private String title;
    private Integer year;

    public void Start() {
        PrintMenu();
    }

    private void PrintMenu() {

        boolean exited = false;

        do {

            String menu = sc.nextLine();

            switch (menu) {
                case "1" -> //könyv hozzáadása

                        InputBook();
                case "2" -> //könyv listázása

                        PrintBook();
                case "3" -> //kilépés
                        exited = true;
                default -> System.out.println("Nem ismert menüpont!");
            }
        } while (!exited);
    }

    private void InputBook() {

        System.out.println("A könyv címe:");
        String title = sc.nextLine();
        System.out.println("A könyv éve:");
        int year = Integer.parseInt(sc.nextLine());
        bookshelf.addBook(title, year);
    }

    private void PrintBook() {

        for (Book book : bookshelf.getBooks()) {
            System.out.println(String.format("Title: %s Year: %d", book.getTitle(), book.getYear()));
        }
    }

}
