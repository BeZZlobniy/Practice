package practice_6;

class GermanShepherd extends Dog {
    public GermanShepherd(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("German Shepherd barks");
    }
}