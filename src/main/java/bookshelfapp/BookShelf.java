package bookshelfapp;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, int year){

        books.add(new Book(title,year));
    }

    public List<Book> getBooks() {
        return books;
    }
}
