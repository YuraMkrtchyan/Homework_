package builder;

import immutable.Genre;

public class Main {
    public static void main(String[] args) {
        Book book = new BookBuilder().setCode("ab123").setAuthor("Pushkin").setDescription("something").
                setGenre(Genre.Drama).setPublishingYear(1830).setTitle("Something dramatic").build();
        System.out.println(book);
    }
}
