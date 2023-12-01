package Practice_19;

import java.util.*;
public class ToList {
    public static <T> List<T> convertList(T array[]){
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
    public static void main(String[] args){
        Integer[] number = {11, 1543, 236, 11};
        List<Integer> list = convertList(number);
        System.out.println("List: " + list);
        String[] str = {"a", "b", "c", "d", "e", "f"};
        List<String> list_1 = convertList(str);
        System.out.println("List: " + list_1);
    }
}
