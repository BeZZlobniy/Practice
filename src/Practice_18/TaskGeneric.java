package Practice_18;

public class TaskGeneric<T, V, K> {
    private T first;
    private V second;
    private K third;

    public TaskGeneric(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "TaskGeneric{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public void getClassName() {
        System.out.println("first class: " + first.getClass().getName());
        System.out.println("second class: " + second.getClass().getName());
        System.out.println("third class: " + third.getClass().getName());
    }
}
