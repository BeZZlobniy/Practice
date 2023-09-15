package practice_4_human;

public class Human {
    private final Head head;
    private final Hand leftHand;
    private final Hand rightHand;
    private final Leg leftLeg;
    private final Leg rightLeg;

    public Human() {
        this.head = new Head();
        this.leftLeg = new Leg();
        this.rightLeg = new Leg();
        this.leftHand = new Hand();
        this.rightHand = new Hand();
    }

    public void walk() {
        System.out.println("Человек идет: ");
        leftLeg.move();
        rightLeg.move();
    }

    public void stomp() {
        System.out.println("Человек обоими ногами стучит: ");
        leftLeg.stomp();
        rightLeg.stomp();
    }

    public void wave() {
        System.out.println("Человек машет руками: ");
        leftHand.move();
        rightHand.move();
    }

    public void grab() {
        System.out.println("Человек хватает сразу двумя руками: ");
        leftHand.grab();
        rightHand.grab();
    }

    public void think() {
        System.out.println("Человек думает: ");
        head.think();
    }

    public void talk() {
        System.out.println("Человек говорит: ");
        head.speak();
    }
}
