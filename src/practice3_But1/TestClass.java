package practice3_But1;

public class TestClass {
    public static void main(String[] args){
        Dog dog = new Dog("�����", 11241234);
        Book book = new Book("������", "��������");
        Ball ball = new Ball("�����", 14.5);

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
