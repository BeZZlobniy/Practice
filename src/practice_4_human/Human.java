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
        System.out.println("������� ����: ");
        leftLeg.move();
        rightLeg.move();
    }

    public void stomp() {
        System.out.println("������� ������ ������ ������: ");
        leftLeg.stomp();
        rightLeg.stomp();
    }

    public void wave() {
        System.out.println("������� ����� ������: ");
        leftHand.move();
        rightHand.move();
    }

    public void grab() {
        System.out.println("������� ������� ����� ����� ������: ");
        leftHand.grab();
        rightHand.grab();
    }

    public void think() {
        System.out.println("������� ������: ");
        head.think();
    }

    public void talk() {
        System.out.println("������� �������: ");
        head.speak();
    }
}
