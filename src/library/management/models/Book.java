package library.management.models;

public class Book<T> {
    private final String title;
    private final Author author;
    private final Genre genre;
    private final T content;

    public Book(Builder<T> builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.genre = builder.genre;
        this.content = builder.content;
    }

    public static class Builder<T> {
        private String title;
        private Author author;
        private Genre genre;
        private T content;

        public Builder<T> setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder<T> setAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Builder<T> setGenre(Genre genre) {
            this.genre = genre;
            return this;
        }


        public Builder<T> setContent(T content) {
            this.content = content;
            return this;
        }

        public Book<T> build() {
            return new Book<T>(this);
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

    public T getContent() {
        return content;
    }
}
