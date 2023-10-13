package practice_10;
import java.util.Scanner;
public class Task1 {
    public static void monAfter(int n, int max, int count){
        if (n <= max) {
            for (int i = 0; i <= n - 1; i++) {
                count+=1;
                if (count <= max) {
                    System.out.println(n);
                }
                else{return;}
            }
            monAfter(n+1, max, count);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        monAfter(1, n, 0);

    }
}
