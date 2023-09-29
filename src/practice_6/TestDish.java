package practice_6;

public class TestDish {
    public static void main(String[] args) {
        Plate plate = new Plate("Ceramic", 20, true);
        System.out.println("Material: " + plate.getMaterial());
        System.out.println("Weight: " + plate.getWeight());
        System.out.println("Has Rim: " + plate.hasRim());
        plate.use();

        Cup cup = new Cup("Glass", 10, false);
        System.out.println("Material: " + cup.getMaterial());
        System.out.println("Weight: " + cup.getWeight());
        System.out.println("Has Handle: " + cup.hasHandle());
        cup.use();
    }
}
