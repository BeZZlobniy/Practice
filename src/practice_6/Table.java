package practice_6;

public class Table extends Furniture {
    private int numOfSeats;

    public Table(String material, double price, int numOfSeats) {
        super(material, price);
        this.numOfSeats = numOfSeats;
    }

    @Override
    public void assemble() {
        System.out.println("Собираем стол из материала " + getMaterial() +
                " с ценой " + getPrice() + " и " + numOfSeats + " посадочными местами");
    }
}
