package practice_6;

class LabradorRetriever extends Dog {
    public LabradorRetriever(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Labrador Retriever barks");
    }
}
