package practice_8;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
        super();
        width = new Random().nextInt(100) + 50;
        height = new Random().nextInt(100) + 50;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
