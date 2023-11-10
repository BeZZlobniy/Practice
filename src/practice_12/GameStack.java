package practice_12;

import java.util.Stack;

public class GameStack {
    Stack<Integer> first = new Stack();
    Stack<Integer> second = new Stack();

    public GameStack(String first, String second) {
        for (int i = 4; i >= 0; --i) {
            this.first.push(Integer.parseInt(first.substring(i, i + 1)));
            this.second.push(Integer.parseInt(second.substring(i, i + 1)));
        }

    }

    private void pushBack(Stack<Integer> str, Integer number) {
        Stack<Integer> new_str = new Stack();

        while (!str.isEmpty()) {
            new_str.push((Integer) str.pop());
        }

        str.push(number);

        while (!new_str.isEmpty()) {
            str.push((Integer) new_str.pop());
        }

    }

    public String play() {
        int count;
        for (count = 0; !this.first.isEmpty() && !this.second.isEmpty() && count <= 106; ++count) {
            if ((Integer) this.first.peek() > (Integer) this.second.peek() && (Integer) this.second.peek() != 0) {
                this.pushBack(this.first, (Integer) this.first.pop());
                this.pushBack(this.first, (Integer) this.second.pop());
            } else {
                this.pushBack(this.second, (Integer) this.first.pop());
                this.pushBack(this.second, (Integer) this.second.pop());
            }
        }

        String res = "";
        if (this.first.isEmpty()) {
            res = res + "second ";
        } else {
            res = res + "fisrt ";
        }

        res = res + count;
        if (count >= 106) {
            res = "botva";
        }

        return res;
    }
}