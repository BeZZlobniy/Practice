package practice_6;

public class Plate extends Dish{
    private boolean hasRim;
    public Plate(String material, double weight, boolean hasRim) {
        super(material, weight);
        this.hasRim = hasRim;
    }
    public boolean hasRim() {
        return hasRim;
    }

    public void setHasRim(boolean hasRim) {
        this.hasRim = hasRim;
    }

    @Override
    void use() {
        System.out.println("Using a plate");
    }
}
