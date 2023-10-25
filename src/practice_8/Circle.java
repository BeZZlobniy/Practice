package practice_8;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

class Circle extends Shape {
    private int radius;

    public Circle() {
        super();
        radius = new Random().nextInt(50) + 25;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}
