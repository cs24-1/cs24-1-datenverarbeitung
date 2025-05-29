package library.management.testing;

import library.management.models.Author;
import library.management.models.Book;
import library.management.models.Genre;

public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("Hello, Library Management System!");

        // Beispielautoren
        Author jkrowling = new Author("Rowling", "J.K.", 1965);
        Author hemingway = new Author("Hemingway", "Ernest", 1899);
        Author snow = new Author("Snow", "Rose", 2015);
        Author tanenbaum = new Author("Tanenbaum", "Andrew S.", 1944);
        Author doyle = new Author("Doyle", "Arthur Ignatius Conan", 1859);
        Author weir = new Author("Weir", "Andy", 1972);


        // Beispielbücher
        Book rose1 = new Book.Builder()
                .setTitle("Die Bücher der Lügenwahrheit")
                .setAuthor(snow)
                .setGenre(Genre.FANTASY)
                .build();

        Book rose2 = new Book.Builder()
                .setTitle("3 Lilien")
                .setAuthor(snow)
                .setGenre(Genre.FANTASY)
                .build();

        Book harryPotter = new Book.Builder()
                .setTitle("Harry Potter und der Stein der Weisen")
                .setAuthor(jkrowling)
                .setGenre(Genre.FANTASY)
                .build();

        Book computerArchitecture = new Book.Builder()
                .setTitle("Computer Architecture: A Quantitative Approach")
                .setAuthor(tanenbaum)
                .setGenre(Genre.NON_FICTION)
                .build();

        Book sherlockHolmes = new Book.Builder()
                .setTitle("Sherlock Holmes: A Study in Scarlet")
                .setAuthor(doyle)
                .setGenre(Genre.MYSTERY)
                .build();

        Book martian = new Book.Builder()
                .setTitle("Der Marsianer")
                .setAuthor(weir)
                .setGenre(Genre.SCIENCE_FICTION)
                .build();
    }
}
