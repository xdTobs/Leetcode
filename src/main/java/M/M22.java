package M;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class M22 {
    Stack<Character> stack;
    List<String> res;

    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        stack = new Stack<>();
        backtrack(0,0,n);
        return res;
    }

    public void backtrack(int openN, int closedN, int n) {
        if (openN == closedN && closedN == n) {
            Iterator vale = stack.iterator();
            String temp = "";
            while (vale.hasNext()) {
                temp = temp + vale.next();
            }
            res.add(temp);
        }
        if(openN<n){
            stack.add('(');
            backtrack(openN+1,closedN,n);
            stack.pop();
        }
        if(closedN<openN){
            stack.add(')');
            backtrack(openN,closedN+1,n);
            stack.pop();
        }
    }
}

