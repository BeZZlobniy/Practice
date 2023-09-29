package practice_6;

public class TestDog {
    public static void main(String[] args) {
        Dog labrador = new LabradorRetriever("Max", 3);
        Dog germanShepherd = new GermanShepherd("Buddy", 5);

        System.out.println(labrador.getName() + " is " + labrador.getAge() + " years old");
        labrador.sound();
        labrador.eat();

        System.out.println(germanShepherd.getName() + " is " + germanShepherd.getAge() + " years old");
        germanShepherd.sound();
        germanShepherd.eat();
    }
}
