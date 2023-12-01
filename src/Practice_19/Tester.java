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

        Arr<String> stringArr1 = new Arr<>();
        stringArr1.add("1�");
        stringArr1.add("2�");
        stringArr1.add("3�");
        stringArr1.add("4�");
        stringArr1.add("5�");
        stringArr1.add("6�");
        stringArr1.add("7�");
        stringArr1.add("8�");
        stringArr1.add("9�");
        stringArr1.add("10�");
        stringArr1.add("11�");
        System.out.println(stringArr1.get(8));
        System.out.println(stringArr1.getSize());

        ArrayList<String> fileNames = getFileNames("C:\\Users\\bezzlobniy\\IdeaProjects\\Practice\\src\\Practice_19");
        for (int i = 0; i < 5 && i < fileNames.size(); i++) {
            System.out.println(fileNames.get(i));
        }
    }

    public static <E> ArrayList<E> toList(E[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static ArrayList<String> getFileNames(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        ArrayList<String> fileNames = new ArrayList<String>();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileNames.add(file.getName());
                }
            }
        }
        return fileNames;
    }
}
