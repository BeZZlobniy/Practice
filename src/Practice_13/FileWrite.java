package Practice_13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���������� ��� ������ � ����:");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("file.txt")) {
            writer.write(input);
            System.out.println("���������� ������� �������� � ����.");
        } catch (IOException e) {
            System.out.println("������ ��� ������ � ����: " + e.getMessage());
        }
    }
}