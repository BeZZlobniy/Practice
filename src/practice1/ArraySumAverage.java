package practice1;

import java.util.Scanner;

public class ArraySumAverage {
    public static int input() {
        try{
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
        catch(Exception e){
            System.out.println("������� ������������ ��������, ������� ����� ����������� �����");
            return input();
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ������ �������: ");
        int size = input();

        int[] numbers = new int[size];

        System.out.println("������� �������� �������:");
        for (int i = 0; i < size; i++) {
            System.out.print("������� #" + (i + 1) + ": ");
            numbers[i] = input();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / size;

        System.out.println("����� ��������� �������: " + sum);
        System.out.println("������� �������������� ���������: " + average);

        scanner.close();
    }
}