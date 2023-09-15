package practice1;

public class FactorialCalculator {
    // ћетод дл€ вычислени€ факториала числа
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("‘акториал определен только дл€ неотрицательных чисел.");
        }
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        // ѕример использовани€ метода дл€ вычислени€ факториала
        int number = 5; // «десь вы можете изменить число дл€ вычислени€ факториала
        long result = calculateFactorial(number);
        System.out.println("‘акториал числа " + number + " равен " + result);
    }
}