package Practice_19;

public class AnyListFunction<E> {
    private E[] arr;

    public void setArr(E[] arr) {
        this.arr = arr;
    }
    public void showArr(){
        for (Object str: arr){
            System.out.println(str + ", ");
        }
        System.out.println();
    }
}
