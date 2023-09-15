package practice_4_other;

public class TestBook {
    public static void main(String[] args){
        Book book = new Book();
        book.setAuthor("Стивен Кинг");
        book.setTitle("Темная башня: Стрелок");
        book.setYear(1982);

        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания "+ book.getYear());

        book.toString();
    }
}
