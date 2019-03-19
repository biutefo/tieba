package pers.xin.five;

public class Main {
    public static void main(String[] args) {
        LinkStack<Integer> stack = new LinkStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        Integer ele1 = stack.pop();
        System.out.println("出栈"+ele1);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(6);
        Integer ele2 = stack.pop();
        System.out.println("出栈"+ele2);
        stack.push(7);
        stack.push(8);
        String s = stack.toString();
        System.out.println(s);
    }
}
