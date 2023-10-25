package practice_11_GPA;

import java.util.Comparator;

public class SortingStudentsByGPA {
    public static void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private static int partition(Student[] students, int low, int high) {
        Student pivot = students[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (0 < new StudentComporator().compare(students[j], pivot)) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);
        return i + 1;
    }

    private static void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Джамшут", 3.5),
                new Student("Арамзяун", 3.8),
                new Student("Джидулбек", 3.1),
                new Student("Сулейман", 3.9)
        };

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        SortingStudentsByGPA.quickSort(students, 0, students.length - 1);

        System.out.println("\nПосле сортировки по GPA (По убыванию):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}