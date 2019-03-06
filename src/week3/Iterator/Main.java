package week3.Iterator;

public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        stack.push("kwik");
        stack.push("kwek");
        stack.push("kwak");

        for (String str : stack)
            System.out.println(str);

        stack.push("kwik");
        stack.push("kwek");
        stack.push("kwak");

        for (int i=0; i<3; i++)
            System.out.println(stack.pop());

    }
}