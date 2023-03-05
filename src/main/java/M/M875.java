package M;

import java.util.Arrays;

public class M875 {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1,right = 1;
        for(int i : piles)
            right = Math.max(right,i);

        while (left < right) {


            int mid = (left + right) / 2;

            int hoursSpent =0;
            for (int pile : piles) {
                hoursSpent += Math.ceil((double) pile / mid);
            }

            if (hoursSpent<=h)
                right = mid;
            else {
                left = mid + 1;
            }
        }

        return right;
    }
}
