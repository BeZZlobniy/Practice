package practice3_But1;

public class Ball {
    private String color;
    private double size;

    public Ball(String color, double size) {
        this.color = color;
        this.size = size;
    }

    public void kick() {
        System.out.println("��� ����� " + color + " �������� " + size + " ����� ��� ������!");
    }

    public void bounce() {
        System.out.println("��� ����� " + color + " �������� " + size + " ����� �����������!");
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
