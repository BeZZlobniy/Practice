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
            throw new IncorrectINNException("ИНН не может быть пустым");
        } else if (!isInteger(input)) {
            throw new IncorrectINNException("ИНН должен состоять из цифр");
        } else if (input.length() != 12 & input.length() != 10) {
            throw new IncorrectINNException("ИНН должен состоять из 10 или 12 цифр");
        } else if (Integer.parseInt(input) == 0) {
            throw new IncorrectINNException("Некорректный номер ИНН не должен состоять только из 0");
        } else if (input.startsWith("00")) {
            throw new IncorrectINNException("Некорректный номер региона (первые 2 цифры)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try{
            validateINN(input);
            System.out.println("ИНН корректен");
        } catch (IncorrectINNException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
