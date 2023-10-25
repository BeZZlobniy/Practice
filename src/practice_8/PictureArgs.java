package practice_8;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PictureArgs {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Не указан путь к картинке");
            return;
        }
        System.out.println(args[0]);
        JFrame frame = new JFrame("Отображение картинки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(args[0]);
        JLabel label = new JLabel(imageIcon);
        frame.getContentPane().add(label);

        frame.pack();

        frame.setVisible(true);
    }
}
