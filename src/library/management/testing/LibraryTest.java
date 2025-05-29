package library.management.testing;

import library.management.models.Author;
import library.management.models.Book;
import library.management.models.Genre;
import library.management.models.Library;

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
        Book<String> rose1 = new Book.Builder<String>()
                .setTitle("Die Bücher der Lügenwahrheit")
                .setAuthor(snow)
                .setGenre(Genre.FANTASY)
                .setContent("Der Landschaft Cornwalls wohnt ein besonderer Zauber inne.")
                .build();

        Book<String> rose2 = new Book.Builder<String>()
                .setTitle("3 Lilien")
                .setAuthor(snow)
                .setGenre(Genre.FANTASY)
                .build();

        Book<String> harryPotter = new Book.Builder<String>()
                .setTitle("Harry Potter und der Stein der Weisen")
                .setAuthor(jkrowling)
                .setGenre(Genre.FANTASY)
                .setContent("Mr. und Mrs. Dursley, von Nummer vier, Privet Drive, waren stolz darauf, ganz und gar normal zu sein, sehr stolz sogar.")
                .build();

        Integer[] hexContent = {
                0x45, 0x69, 0x6E, 0x20, 0x43, 0x6F, 0x6D, 0x70,
                0x75, 0x74, 0x65, 0x72, 0x20, 0x6F, 0x64, 0x65,
                0x72, 0x20, 0x44, 0x69, 0x67, 0x69, 0x74, 0x61,
                0x6C, 0x72, 0x65, 0x63, 0x68, 0x6E, 0x65, 0x72,
                0x20, 0x69, 0x73, 0x74, 0x20, 0x65, 0x69, 0x6E,
                0x65, 0x20, 0x4D, 0x61, 0x73, 0x63, 0x68, 0x69,
                0x6E, 0x65, 0x2C, 0x20, 0x64, 0x69, 0x65, 0x20,
                0x50, 0x72, 0x6F, 0x62, 0x6C, 0x65, 0x6D, 0x65,
                0x20, 0x66, 0xFC, 0x72, 0x20, 0x64, 0x65, 0x6E,
                0x20, 0x4D, 0x65, 0x6E, 0x73, 0x63, 0x68, 0x65,
                0x6E, 0x20, 0x6C, 0xF6, 0x73, 0x65, 0x6E, 0x20,
                0x6B, 0x61, 0x6E, 0x6E, 0x2C, 0x20, 0x69, 0x6E,
                0x64, 0x65, 0x6D, 0x20, 0x73, 0x69, 0x65, 0x20,
                0x64, 0x69, 0x65, 0x20, 0x69, 0x68, 0x72, 0x20,
                0x67, 0x65, 0x67, 0x65, 0x62, 0x65, 0x6E, 0x65,
                0x6E, 0x20, 0x42, 0x65, 0x66, 0x65, 0x68, 0x6C,
                0x65, 0x20, 0x61, 0x75, 0x73, 0x66, 0xFC, 0x68,
                0x72, 0x74, 0x2E
        };

        Book<Integer[]> computerArchitecture = new Book.Builder<Integer[]>()
                .setTitle("Computer Architecture: A Quantitative Approach")
                .setAuthor(tanenbaum)
                .setGenre(Genre.NON_FICTION)
                .setContent(hexContent)
                .build();

        Book<String> sherlockHolmes = new Book.Builder<String>()
                .setTitle("Sherlock Holmes: A Study in Scarlet")
                .setAuthor(doyle)
                .setGenre(Genre.MYSTERY)
                .build();

        Book<String> martian = new Book.Builder<String>()
                .setTitle("Der Marsianer")
                .setAuthor(weir)
                .setGenre(Genre.SCIENCE_FICTION)
                .setContent("Ich bin sowas von im Arsch. Das ist meine wohlüberlegte Meinung. Im Arsch.")
                .build();


        // Beispielbibliothek
        Library<String> library = new Library<>();

        library.addBook(rose1);
        library.addBook(rose2);
        library.addBook(harryPotter);
        library.addBook(sherlockHolmes);
        library.addBook(martian);
        // computerArchitecture kann nicht hinzugefügt werden,
        // da die Typen nicht übereinstimmen.

        // Beispielabfragen
        ResultPrinter<String> resultPrinter = (Book<String> book) -> System.out.println("- Gefunden: " + book.getTitle() + " von " + book.getAuthor());

        System.out.println("Suche nach Büchern mit Titel 'Der Marsianer':");
        library.findByTitle("Der Marsianer").forEach(resultPrinter::showResult);

        System.out.println();

        System.out.println("Suche nach Büchern von Rose Snow:");
        library.findByAuthor("Snow", "Rose").forEach(resultPrinter::showResult);

        System.out.println();

        System.out.println("Suche nach Büchern im Genre FANTASY:");
        library.findByGenre(Genre.FANTASY).forEach(resultPrinter::showResult);

        System.out.println();

        // Bonus
        System.out.println("Suche nach Büchern von irgendeinem 'Row':");
        library.findByAuthor("Row").forEach(resultPrinter::showResult);

        System.out.println();

        System.out.println("Anzahl der Bücher im Genre FANTASY: " + library.countBooksByGenre(Genre.FANTASY));
        System.out.println("Anzahl der Bücher von Arthur I.C. Doyle: " + library.countBooksByAuthor("Doyle", "Arthur Ignatius Conan"));
    }
}
