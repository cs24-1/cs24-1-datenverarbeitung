package library.management.models;

import java.util.ArrayList;
import java.util.List;

public class Library<T> {
    private final List<Book<T>> books = new ArrayList<>();

    public void addBook(Book<T> book) {
        books.add(book);
    }

    public void removeBook(Book<T> book) {
        books.remove(book);
    }
}
