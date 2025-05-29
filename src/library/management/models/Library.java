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

    public List<Book<T>> findByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .toList();
    }

    public List<Book<T>> findByGenre(Genre genre) {
        return books.stream()
                .filter(book -> book.getGenre() == genre)
                .toList();
    }

    public List<Book<T>> findByAuthor(String surname, String firstname) {
        return books.stream()
                .filter(book -> book.getAuthor().surname().equals(surname))
                .filter(book -> book.getAuthor().firstname().equals(firstname))
                .toList();
    }

    public List<Book<T>> findByAuthor(String searchTerm) {
        return books.stream()
                .filter(book ->
                        book.getAuthor().surname().contains(searchTerm)
                                || book.getAuthor().firstname().contains(searchTerm))
                .toList();
    }

    public long countBooksByGenre(Genre genre) {
        return books.stream()
                .filter(book -> book.getGenre().equals(genre))
                .count();
    }

    public long countBooksByAuthor(String surname, String firstname) {
        return books.stream()
                .filter(book -> book.getAuthor().surname().equals(surname))
                .filter(book -> book.getAuthor().firstname().equals(firstname))
                .count();
    }
}
