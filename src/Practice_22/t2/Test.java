package Practice_22.t2;

public class Test {
    public static void main(String[] args){
        Client client = new Client();
        ChairFactory factory = new ChairFactory();

        client.setChair(factory.createVictorianChair());
        client.sit();
        System.out.println();

        client.setChair(factory.createMagicChair());
        client.sit();
        System.out.println();

        client.setChair(factory.createFunctionalChair());
        client.sit();
    }
}
