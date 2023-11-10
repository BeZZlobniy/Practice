package practice_9;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable book = new Book(19.99);
        Priceable phone = new Phone(20000.0);

        System.out.println("Book price: $" + book.getPrice());
        System.out.println("Car price: $" + phone.getPrice());
    }
}

