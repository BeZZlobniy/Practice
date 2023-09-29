package practice_10;

public class Task2 {
    public static void monAfter(int n, int max){
        if (n <= max) {
            System.out.println(n);
            monAfter(n+1, max);
        }
    }

    public static void main(String[] args){
        int n = 4;
        monAfter(1, n);
    }
}
