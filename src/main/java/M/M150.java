package M;

import java.util.Stack;

public class M150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens) {

            switch (s) {
                case ("+"):
                    stack.add(stack.pop() + stack.pop());
                    break;
                case ("-"):
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.add(b - a);
                    break;
                case ("*"):
                    stack.add(stack.pop() * stack.pop());
                    break;
                case ("/"):
                    int c = stack.pop();
                    int d = stack.pop();
                    stack.add(d / c);
                    break;
                default:
                    stack.add(Integer.parseInt(s));
                    break;
            }
        }
        return stack.pop();
    }
}
