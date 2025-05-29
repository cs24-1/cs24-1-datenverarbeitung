package library.management.models;

public class Book {
    private final String title;
    private final Author author;
    private final Genre genre;

    public Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.genre = builder.genre;
    }

    public static class Builder {
        private String title;
        private Author author;
        private Genre genre;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Builder setGenre(Genre genre) {
            this.genre = genre;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }
}
