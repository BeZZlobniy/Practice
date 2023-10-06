package practice_10;

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
        int A = 1;
        int B = 10;
        monAfter(A, B);
    }
}
