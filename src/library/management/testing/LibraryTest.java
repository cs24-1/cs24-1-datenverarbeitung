package library.management.testing;

import library.management.models.Author;

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
    }
}
