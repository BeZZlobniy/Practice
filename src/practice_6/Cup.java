package practice_6;

public class Cup extends Dish {
    private boolean hasHandle;

    public Cup(String material, double weight, boolean hasHandle) {
        super(material, weight);
        this.hasHandle = hasHandle;
    }

    public boolean hasHandle() {
        return hasHandle;
    }

    public void setHasHandle(boolean hasHandle) {
        this.hasHandle = hasHandle;
    }

    @Override
    void use() {
        System.out.println("Using a cup");
    }
}
