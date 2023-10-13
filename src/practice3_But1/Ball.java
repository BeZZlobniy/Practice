package practice3_But1;

public class Ball {
    private String color;
    private double size;

    public Ball(String color, double size) {
        this.color = color;
        this.size = size;
    }

    public void kick() {
        System.out.println("ћ€ч цвета " + color + " размером " + size + " метра был ударен!");
    }

    public void bounce() {
        System.out.println("ћ€ч цвета " + color + " размером " + size + " метра отскакивает!");
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
