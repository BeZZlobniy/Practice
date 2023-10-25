package practice_8;

import javax.swing.*;
import java.awt.*;

public class GifViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(args[0]);
        JLabel label = new JLabel(icon);

        frame.getContentPane().add(label, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}