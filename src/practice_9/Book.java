package practice_9;

class
Book implements Priceable {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}