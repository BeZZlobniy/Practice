package Practice_19;

public class TryMakeList {
    public static <E> void makeList(String str, E[] arr){
        E[] array = arr;
        AnyListFunction <E> any = new AnyListFunction<E>();
        any.setArr(array);
        any.showArr();
    }

    public static void main(String[] args){
        String[] testStr = {"Каждый", "Охотник", "Желает","Знать", "Где", "Сидит", "Фазан"};
        Integer[] testInt = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        Double[] testDouble = {1.1, 1.3, 1.5, 1.7, 1.9};
        makeList("String", testStr);
        makeList("Integer", testInt);
        makeList("Double", testDouble);
    }
}
