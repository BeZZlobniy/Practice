package practice_5_movable;

public class MovableTest {
    public static void main(String[] args) {
        Movable Test = new MovablePoint(0, 0, 10, 2);
        System.out.println("Test 1: " + Test);
        Test.moveDown();
        Test.moveLeft();
        System.out.println("Test move down and left result: " + Test);

        Test = new MovableCircle(0, 0, 1, -1, 4);
        System.out.println("\nTest 2: " + Test);
        Test.moveUp();
        Test.moveRight();
        System.out.println("Test move right and up result: " + Test);

        Test = new MovableRectangle(0, 0, 2, 4, -1, 1);
        System.out.println("\nTest 3: " + Test);
        Test.moveUp();
        Test.moveRight();
        System.out.println("Test move right and up result: " + Test);

        System.out.println("\nTest 4: ");
        MovableRectangle TestSub = (MovableRectangle) Test;
        TestSub.setSpeed(1, 0);
        TestSub.moveDown();
    }
}