package practice_9;

public class TestNameable {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable car = new Car("BMW");

        System.out.println(planet.getName()); // ������� "Earth"
        System.out.println(car.getName()); // ������� "BMW"
    }
}
