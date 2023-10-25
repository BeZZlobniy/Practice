package practice_6;

public class Chair extends Furniture {
    private int numOfLegs;

    public Chair(String material, double price, int numOfLegs) {
        super(material, price);
        this.numOfLegs = numOfLegs;
    }

    @Override
    public void assemble() {
        System.out.println("�������� ���� �� ��������� " + getMaterial() + " � ����� " +
                getPrice() + " � " + numOfLegs + " �������");
    }
}
