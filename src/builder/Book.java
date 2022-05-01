package builder;

import immutable.Genre;

public class Book {
    private String code;
    private String title;
    private Genre genre;
    private String author;
    private int publishingYear;
    private String description;

    public Book(String code, String title, Genre genre, String author, int publishingYear, String description) {
        this.code = code;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publishingYear = publishingYear;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", description='" + description + '\'' +
                '}';
    }
}
