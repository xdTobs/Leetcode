package M;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class M739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer[]> stack = new Stack<>();
        int[]res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.push(new Integer[]{temperatures[i], 0,0});
                continue;
            }
            int pop = 0;
            while (!stack.isEmpty()&&temperatures[i] > stack.peek()[0]) {

                res[stack.peek()[2]] = pop+1;
                pop += stack.peek()[1] + 1;
                stack.pop();
            }
            stack.push(new Integer[]{temperatures[i],pop,i});
        }
        for (Integer[] arr : stack){
            res[arr[2]] = 0;
        }
    return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        List<int[]> list = new ArrayList<>();

    }
}
