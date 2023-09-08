package practice2;

public class CircleTest {
    public static int correctInput(String digit){
        try {
            return Integer.parseInt(digit);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(correctInput(args[0]));
        Circle circle2 = new Circle(correctInput(args[1]));

        System.out.println("Круг 1 радиус: " + circle1.getRadius());
        System.out.println("Круг 2 радиус: " + circle2.getRadius());

        System.out.println("Круг 1 и 2 площадь: " + circle1.calculateArea() + "    " + circle2.calculateArea());
        System.out.println("Круг 1 и 2 длина окружности: " + circle1.calculateCircumference() + "   " + circle2.calculateCircumference());

        System.out.println("Круги одинаковы? " + circle1.compareCircle(circle2));
    }
}
