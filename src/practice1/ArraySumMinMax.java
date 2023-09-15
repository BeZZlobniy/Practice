package practice1;

import java.util.Scanner;

public class ArraySumMinMax {
    public static int input() {
        try{
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            if (value > 0){
                return value;
            }
            System.out.println("������� ������������ ��������, ������� ����� ����������� �����");
            return input();
        }
        catch(Exception e){
            System.out.println("������� ������������ ��������, ������� ����� ����������� �����");
            return input();
        }
    }
    public static void main(String[] args) {

        System.out.print("������� ������ �������: ");
        int size = input();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            try{
            System.out.print("������� ������� ������� #" + (i + 1) + ": ");
            numbers[i] = input();}
            catch (NumberFormatException e) {
                System.out.println("������� ������������ ��������");
            }
        }

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        int index = 0;

        do {
            sum += numbers[index];
            index++;
        } while (index < size);

        index = 1;
        while (index < size) {
            if (numbers[index] > max) {
                max = numbers[index];
            }
            if (numbers[index] < min) {
                min = numbers[index];
            }
            index++;
        }

        System.out.println("����� ��������� �������: " + sum);
        System.out.println("������������ �������: " + max);
        System.out.println("����������� �������: " + min);
    }
}
