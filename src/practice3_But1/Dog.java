package practice3_But1;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("���-���!");
    }

    public void run() {
        System.out.println("������ " + name + " �����!");
    }

    public void sleep() {
        System.out.println("������ " + name + " ����.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
