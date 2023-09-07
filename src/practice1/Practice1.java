package practice1;
import java.util.Scanner;


public class Practice1 {
    public static void main(String[] args) {
        // Перебираем все аргументы входной строки
        for (int i = 0; i < args.length; i++) {
            // Выводим аргумент на экран
            System.out.println("Аргумент " + (i+1) + ": " + args[i]);
        }
    }
}