package practice_11_task3;

import java.util.ArrayList;
import java.util.List;


public class Main {
    // Метод для сравнения студентов по возрасту (может быть изменен для другого поля)
    public static int compareByAge(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
    // Метод для слияния и сортировки двух списков студентов
    public static List<Student> mergeAndSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>(list1.size() + list2.size());
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (compareByAge(list1.get(i), list2.get(j)) < 0) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Сандор", 29));
        list1.add(new Student("Тирион", 22));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Эддард", 19));
        list2.add(new Student("Брандон", 21));

        List<Student> mergedAndSorted = mergeAndSort(list1, list2);

        for (Student student : mergedAndSorted) {
            System.out.println(student);
        }
    }
}
