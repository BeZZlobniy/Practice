package Practice_17;

import java.util.Scanner;

public class TestException {
    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void validateINN(String input) throws IncorrectINNException {
        if (input == null || input.isEmpty()) {
            throw new IncorrectINNException("��� �� ����� ���� ������");
        } else if (!isInteger(input)) {
            throw new IncorrectINNException("��� ������ �������� �� ����");
        } else if (input.length() != 12 & input.length() != 10) {
            throw new IncorrectINNException("��� ������ �������� �� 10 ��� 12 ����");
        } else if (Integer.parseInt(input) == 0) {
            throw new IncorrectINNException("������������ ����� ��� �� ������ �������� ������ �� 0");
        } else if (input.startsWith("00")) {
            throw new IncorrectINNException("������������ ����� ������� (������ 2 �����)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try{
            validateINN(input);
            System.out.println("��� ���������");
        } catch (IncorrectINNException e){
            System.out.println("������: " + e.getMessage());
        }
    }
}
