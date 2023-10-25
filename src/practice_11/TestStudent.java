package practice_11;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("John", 10);
        students[1] = new Student("Alice", 7);
        students[2] = new Student("Bob", 5);
        students[3] = new Student("Charlie", 9);
        students[4] = new Student("Eve", 12);

        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }

            students[j + 1] = key;
        }

        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getIDNumber());
        }
    }
}

