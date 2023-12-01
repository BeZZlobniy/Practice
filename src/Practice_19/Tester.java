package Practice_19;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 4, 5};
        System.out.println(toList(intArr));

        String[] stringArr = {"hate", "the", "java"};
        System.out.println(toList(stringArr));

        MyArr<String> lonArr = new MyArr<>();
        lonArr.add("1é");
        lonArr.add("2é");
        lonArr.add("3é");
        lonArr.add("4é");
        lonArr.add("5é");
        lonArr.add("6é");
        lonArr.add("7é");
        lonArr.add("8é");
        lonArr.add("9é");
        lonArr.add("10é");
        lonArr.add("11é");
        System.out.println(lonArr.get(8));
        System.out.println(lonArr.getSize());
        File dir = new File("C:\\Users\\bezzlobniy\\IdeaProjects\\Practice\\src\\Practice_19");
        showFiles(dir);
    }

    public static <E> ArrayList<E> toList(E[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void showFiles(File someDir) {
        ArrayList<String> files = new ArrayList<>(Arrays.asList(someDir.list()));
        for (int i = 0; i < 5; i++) {
            System.out.println(files.get(i));
        }
    }
}

