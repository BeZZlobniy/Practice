package practice1;
import java.util.Scanner;


public class Practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ��������� ����� ������: ");
        String inLine = in.nextLine();
        String[] array = inLine.split(" ");


        for (String s : array) {
            System.out.println(s);
        }
    }
}
