package practice3_But1;

public class TestClass {
    public static void main(String[] args){
        Dog dog = new Dog("Бобик", 11241234);
        Book book = new Book("Библия", "Метатрон");
        Ball ball = new Ball("Синий", 14.5);

        book.read();
        book.close();
        System.out.println(book.toString() + "\n");

        dog.run();
        dog.bark();
        dog.sleep();
        System.out.println(dog.toString() + "\n");

        ball.bounce();
        ball.kick();
        System.out.println(ball.toString() + "\n");

    }
}
