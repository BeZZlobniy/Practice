package practice_11_GPA;

import java.util.Comparator;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " : " + gpa;
    }
}

