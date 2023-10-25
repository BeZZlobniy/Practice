package practice_8;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Main extends JPanel {
    private Shape[] shapes;

    public Main() {
        shapes = new Shape[20];
        for (int i = 0; i < 20; i++) {
            if (new Random().nextInt(100) % 2 == 0) {
                shapes[i] = new Rectangle();
            } else {
                shapes[i] = new Circle();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.add(new Main());
        frame.setVisible(true);
    }
}

