package S;

import java.util.Stack;

public class S84 {
    public static int largestRectangleArea(int[] heights) {
        int res = 0;
        Stack<Integer[]> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {

            int start = i;
            while(!stack.isEmpty()&&stack.peek()[1]>=heights[i]){
                Integer[] vals = stack.pop();
                res=Math.max(res,vals[1]*(i-vals[0]));
                start = vals[0];
            }
            stack.push(new Integer[]{start,heights[i]});
        }
        while(!stack.isEmpty()){
            Integer[] vals = stack.pop();
            res=Math.max(res,vals[1]*(heights.length-vals[0]));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,2}));
    }
}
