package ms0.a0;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println(stack.size());//0
        stack.push("Igi");
        System.out.println(stack.size());//1
        stack.push("Daiu");
        System.out.println(stack.size());//2
        stack.push("Test");
        System.out.println(stack.size());//3
        System.out.println(stack.pop());//Test
        System.out.println(stack.size());//2
        System.out.println(stack.pop()); //Daiu
        System.out.println(stack.size());//1
        stack.push("Igi 2");
        System.out.println(stack.size()); //2
        System.out.println(stack.peek()); //Igi 2
        System.out.println(stack.size()); // 2
    }
}
