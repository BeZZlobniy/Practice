package Practice_18;

public class MinMax <T extends Comparable<T>>{
    private T[] array;
    public MinMax(T[] array){
        this.array = array;
    }

    public T min(){
        T minimum = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i].compareTo(minimum) < 0)
                minimum = array[i];
        return minimum;
    }

    public T max(){
        T maximum = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i].compareTo(maximum) > 0)
                maximum = array[i];
        return maximum;
    }
}
