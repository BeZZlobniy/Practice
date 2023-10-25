package practice_8;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape() {
        Random rand = new Random();
        color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        x = rand.nextInt(500);
        y = rand.nextInt(500);
    }

    public abstract void draw(Graphics g);
}
