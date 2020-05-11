package ms0.a1;

public class Main {
    public static void main(String[] args) {
        Tokenizer t = new Tokenizer(" A   42    Epsilon     Q    16");
        while (!t.done()) {
            System.out.println(t.next());
        }
    }
}


