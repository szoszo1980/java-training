package oo;

public class ObjecOrientedDemo {
    public static void main(String[] args) {
        Book book = new Book("Java", 1980);
        Book another = new Book(book);

        System.out.println(String.format("%s %d",book.getTitle(),book.getYear()));
        System.out.println(String.format("%s %d",another.getTitle(),another.getYear()));
        System.out.println(book.toString());
    }
}
