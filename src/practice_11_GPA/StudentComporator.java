package practice_11_GPA;

import java.util.Comparator;

public class StudentComporator implements Comparator<Student>
{
    public int compare(Student s1, Student s2) {
        // Сортируем по убыванию баллов (от большего к меньшему)
        return Double.compare(s2.getGPA(), s1.getGPA());
    }
}
