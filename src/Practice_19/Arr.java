package Practice_19;

import java.util.ArrayList;

public class Arr<E> {
    private ArrayList<E> elements;
    private int size;

    public Arr() {
        elements = new ArrayList<E>();
        size = 0;
    }

    public void add(E el) {
        elements.add(el);
        size++;
    }

    public void setElements(ArrayList<E> elements) {
        this.elements = elements;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public E get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return elements.get(index);
    }
}