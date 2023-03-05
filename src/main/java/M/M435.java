package M;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M435 {
    public int eraseOverlapIntervals(int[][] intervals) {



        Arrays.sort(intervals,(a, b) -> Integer.compare(a[0],b[0]));
        int curEnd=intervals[0][1];
        int res =0;
        for (int i = 1; i < intervals.length; i++) {

         if(intervals[i][0]>=curEnd){
             curEnd = intervals[i][1];

         }
         else{
             res++;
             curEnd = Math.min(intervals[i][1],curEnd);

         }

        }
        return res;
    }
}
