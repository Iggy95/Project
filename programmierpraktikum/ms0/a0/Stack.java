package ms0.a0;

public class Stack {
    private String[] items = new String[0];
    private int index = 0;

    public String push(String item) {
        String[] temp = new String[this.index + 1];
        for(int i = 0; i < this.index; i++) {
            temp[i] = this.items[i];
        }
        temp[this.index++] = item;
        this.items = temp;

        return item;
    }
    public String pop() {
        return this.items[--this.index];
    }
    public String peek() {
        return this.items[this.index - 1];
    }
    public int size() {
        return this.index;
    }
}
