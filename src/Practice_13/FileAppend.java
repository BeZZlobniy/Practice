package Practice_13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class FileAppend {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String fileName = "file.txt";
        System.out.println("Введите текст для добавления");
        String text = scanner.nextLine();

        // `true` will append the new data
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.write(text);
            System.out.println("Successfully written data to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
