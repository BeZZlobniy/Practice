package practice_6;

public abstract class Dish {
    private String material;
    private double weight;

    public Dish(String material, double weight) {
        this.material = material;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    abstract void use();
}