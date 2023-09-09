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

        System.out.println("���� 1 ������: " + circle1.getRadius());
        System.out.println("���� 2 ������: " + circle2.getRadius());

        System.out.println("���� 1 � 2 �������: " + circle1.calculateArea() + "    " + circle2.calculateArea());
        System.out.println("���� 1 � 2 ����� ����������: " + circle1.calculateCircumference() + "   " + circle2.calculateCircumference());

        System.out.println("����� ���������? " + circle1.compareCircle(circle2));
    }
}
