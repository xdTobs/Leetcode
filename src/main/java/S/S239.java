package S;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class S239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int l = 0,r=0;
        Deque<Integer> q = new LinkedList<>();

        while(r<nums.length){

            while(!q.isEmpty()&&nums[r]>nums[q.peekLast()])
                q.pollLast();

            q.offer(r);

            if(!q.isEmpty()&&l>q.peekFirst())
                q.pollFirst();

            if (r + 1 >= k) {
                ans[l] = nums[q.peekFirst()];
                l++;
            }

            r++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, -1}, 1)));
    }
}
