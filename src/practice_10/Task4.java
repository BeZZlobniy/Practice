package practice_10;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int k = 7;
        int s = 10;

        long count = countNumbers(k, s);
        System.out.println("Количество " + k + "-значных натуральных чисел с суммой цифр " + s + ": " + count);
    }

    public static long countNumbers(int k, int s) {
        long[][] memo = new long[k + 1][s + 1];
        for (int i = 0; i <= k; i++)
            Arrays.fill(memo[i], -1);

        return countNumbersRecursive(k, s, memo);
    }

    public static long countNumbersRecursive(int k, int s, long[][] memo) {
        if (k == 0 && s == 0) {return 1;}
        if (k == 0 || s < 0) {return 0;}
        if (memo[k][s] != -1) {return memo[k][s];}

        long count = 0;

        for (int digit = 0; digit <= 9; digit++)
            if (s - digit >= 0)
                count += countNumbersRecursive(k - 1, s - digit, memo);

        memo[k][s] = count;
        return count;
    }
}
