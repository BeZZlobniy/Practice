package Practice_14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Message");
        al.add("Another message");

        WaitList<String> wl = new WaitList<>();
        wl.add("Message");
        wl.add("Another message");
        wl.add("New another message");
        System.out.println(wl);
        System.out.println("Удаляемый элемент: " + wl.remove());
        System.out.println(wl);

        BoundedWaitList<String> bwl = new BoundedWaitList<>(3);
        bwl.add("New message");
        bwl.add("Second message");
        bwl.add("Joke");
        System.out.println();
        System.out.println(bwl);

        try {
            bwl.add("A message that goes beyond");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Количество элементов: " + bwl.getCapacity());
        System.out.println();

        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        uwl.add(112);
        uwl.add(25);
        uwl.add(213);
        uwl.add(5124);
        uwl.add(5645);
        uwl.add(6347);
        System.out.println(uwl);
        uwl.remove(25);
        System.out.println(uwl);
        uwl.moveToBack(213);
        System.out.println(uwl);
    }
}
