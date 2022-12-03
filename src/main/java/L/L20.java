package L;

import java.util.HashMap;
import java.util.Stack;

public class L20 {
    public static boolean isValid(String s) {
        HashMap<Character, Character> parenthesesPair = new HashMap<Character, Character>();
        parenthesesPair.put('(', ')');
        parenthesesPair.put('[', ']');
        parenthesesPair.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!parenthesesPair.containsKey(c)) {
                if (stack.isEmpty())return false;
                if (parenthesesPair.get(stack.peek())==c){
                stack.pop();
                }else return false;
            }else stack.push(c);
        }
return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("]()]"));
    }
}

