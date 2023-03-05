package zzz;

import java.util.Stack;

public class MinStack {

    int min;
    Stack<Integer> stack;
    Stack<Integer> sorted;
    public MinStack() {

    stack = new Stack<>();
    sorted = new Stack<>();
    }

    public void push(int val) {
        if(sorted.isEmpty()||val<=sorted.peek())
            sorted.add(val);
        stack.push(val);
    }

    public void pop() {

        int i =stack.pop();
        if(sorted.peek()==i)
            sorted.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return sorted.peek();
    }
}
class Run{
    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(3);
        m.push(2);
        m.push(4);
        m.push(1);
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.getMin());
    }
}
