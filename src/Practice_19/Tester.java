package Practice_19;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 4, 5};
        System.out.println(toList(intArr));

        String[] stringArr = {"Hate", "9", "AM"};
        System.out.println(toList(stringArr));

        Arr<String> stringArr1 = new Arr<>();
        stringArr1.add("1й");
        stringArr1.add("2й");
        stringArr1.add("3й");
        stringArr1.add("4й");
        stringArr1.add("5й");
        stringArr1.add("6й");
        stringArr1.add("7й");
        stringArr1.add("8й");
        stringArr1.add("9й");
        stringArr1.add("10й");
        stringArr1.add("11й");
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
