package practice_10;

import java.util.Scanner;

public class Task3 {
    public static void monAfter(int Min, int Max){
        int step = 1;
        if (Max < Min){
            step = -1;
        }
        Max += step;
        for (int i = Min; i != Max; i+=step){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        monAfter(A, B);
    }
}
