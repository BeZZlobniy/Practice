package practice2;

public class Cat {
    private String name;
    private int age;
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHumanAge() {
        return age * 7;
    }

    public String toString() {
        return "����� �� �����: " + name + ", ���s " + age + ", �� �� ����������� ������ ���: " + getHumanAge();
    }
}
