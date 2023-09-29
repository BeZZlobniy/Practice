package practice_6;

public abstract class Furniture {
    private String material;
    private double price;

    public Furniture(String material, double price) {
        this.material = material;
        this.price = price;
    }

    public abstract void assemble(); // ����� ��� ������ ������

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}