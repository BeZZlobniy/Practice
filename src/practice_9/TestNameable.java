package practice_9;

public class TestNameable {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable car = new Car("BMW");

        System.out.println(planet.getName()); // Выводит "Earth"
        System.out.println(car.getName()); // Выводит "BMW"
    }
}
