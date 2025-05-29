package library.management.testing;

import library.management.models.Book;

@FunctionalInterface
public interface ResultPrinter<T> {
    abstract void showResult(Book<T> book);
}
