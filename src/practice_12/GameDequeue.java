package practice_12;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameDequeue {
    Deque<Integer> first = new ArrayDeque<>();
    Deque<Integer> second = new ArrayDeque<>();

    public GameDequeue(String first, String second) {
        for(int i = 0; i < 5; ++i) {
            this.first.add(Integer.parseInt(first.substring(i, i + 1)));
            this.second.add(Integer.parseInt(second.substring(i, i + 1)));
        }

    }

    public String play() {
        int count;
        for(count = 0; !this.first.isEmpty() && !this.second.isEmpty() && count < 106; ++count) {
            if ((Integer)this.first.peek() > (Integer)this.second.peek() && (Integer)this.second.peek() != 0) {
                this.first.add((Integer)this.first.remove());
                this.first.add((Integer)this.second.remove());
            } else {
                this.second.add((Integer)this.first.remove());
                this.second.add((Integer)this.second.remove());
            }
        }

        String res = "";
        if (this.first.isEmpty()) {
            res = res + "second ";
        } else if (this.second.isEmpty()) {
            res = res + "first ";
        }

        res = res + count;
        if (count >= 106) {
            res ="botva";
        }

        return res;
    }
}
