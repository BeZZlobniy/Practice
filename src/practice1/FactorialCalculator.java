package practice1;

import java.util.Scanner;

public class FactorialCalculator {
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
    public static long calculateFactorial(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {

        int number = input();
        long result = calculateFactorial(number);
        System.out.println("‘акториал числа " + number + " равен " + result);
    }
}