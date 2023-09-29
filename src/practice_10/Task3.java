package practice_10;

public class Task3 {
    public static void monAfter(int Min, int Max){
        if (Max < Min){
            int change = Min;
            Min = Max;
            Max = change;
        }
        for (int i = Min; i <= Max; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        int A = 4;
        int B = 5;
        monAfter(A, B);
    }
}
