package practice1;
import java.util.Scanner;


public class Practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите аргументы через пробел: ");
        String inLine = in.nextLine();
        if (inLine.length() == 0) {
            System.out.println("Вы не ввели аргументы");
        } else {
            for (int i = 0; i < inLine.length(); i++) {
                System.out.println(args[i]);
            }
        }
    }
}
