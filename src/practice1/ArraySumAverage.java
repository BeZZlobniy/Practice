package practice1;

import java.util.Scanner;

public class ArraySumAverage {
    public static int input() {
        try{
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
        catch(Exception e){
            System.out.println("¬ведено некорректное значение, введите целое натуральное число");
            return input();
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¬ведите размер массива: ");
        int size = input();

        int[] numbers = new int[size];

        System.out.println("¬ведите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Ёлемент #" + (i + 1) + ": ");
            numbers[i] = input();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / size;

        System.out.println("—умма элементов массива: " + sum);
        System.out.println("—реднее арифметическое элементов: " + average);

        scanner.close();
    }
}