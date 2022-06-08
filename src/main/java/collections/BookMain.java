package collections;

import java.text.Collator;
import java.util.*;

public class BookMain {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(
                List.of(new Book("ccc","yy"),
                        new Book("bbb","xxxx"),
                        new Book("aaa","xxxxx"),
                        new Book("ccc","x")
                )
        );

        //Collections.sort(books);//natural orders
        Collections.sort(books,new BookTitleLengthComparator());
        System.out.println(books);

        //Set<Book> booksSet = new TreeSet<>(books);
        Set<Book> booksSet = new TreeSet<>(new BookTitleLengthComparator());
        System.out.println(booksSet);

        for(Book book: booksSet){
            System.out.println(book);
        }

        Set<collections.Employee> employees = new TreeSet<>(new Comparator<collections.Employee>() {
            @Override
            public int compare(collections.Employee o1, collections.Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        employees.add(new collections.Employee("John Doe"));

        List<String> names = new ArrayList<>(List.of("Attila","Árpád","István","Örs"));
        Collections.sort(names);
        System.out.println(names);

        //Collator
        Collections.sort(names, Collator.getInstance(new Locale("hu","HU")));
        System.out.println(names);

        names.sort(Collator.getInstance(new Locale("hu","HU")));//nem tud natural orders szerint rendezni
        System.out.println(names);

        System.out.println(Collections.min(names));
        System.out.println(Collections.min(names,Collator.getInstance(new Locale("hu","HU"))));

    }
}
