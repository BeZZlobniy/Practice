package practice3_But1;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void read() {
        System.out.println("Читаем книгу \"" + title + "\" автора " + author + ".");
    }

    public void close() {
        System.out.println("Закрываем книгу \"" + title + "\".");
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
