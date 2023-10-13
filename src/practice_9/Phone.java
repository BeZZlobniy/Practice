package practice_9;

class Phone implements Priceable {
    private double price;

    public Phone(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}