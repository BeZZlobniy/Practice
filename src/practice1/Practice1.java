package practice1;
import java.util.Scanner;


public class Practice1 {
    public static void main(String[] args) {
        // ���������� ��� ��������� ������� ������
        for (int i = 0; i < args.length; i++) {
            // ������� �������� �� �����
            System.out.println("�������� " + (i+1) + ": " + args[i]);
        }
    }
}