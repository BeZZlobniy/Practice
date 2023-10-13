package practice_10;

import java.util.Scanner;

public class Task2 {
    public static void monAfter(int n, int max){
        if (n <= max) {
            System.out.println(n);
            monAfter(n+1, max);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        monAfter(1, n);
    }
}
