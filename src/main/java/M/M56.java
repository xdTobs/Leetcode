package M;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> output = new ArrayList<>();
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        output.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int curStart = intervals[i][0];
            if (curStart<=output.get(output.size() - 1)[1]) {
                output.get(output.size() - 1)[1] = Math.max(output.get(output.size() - 1)[1], intervals[i][1]);
            } else {
                output.add(intervals[i]);
            }
        }

        int[][] res = new int[output.size()][2];
        output.toArray(res);
        return res;
    }

}
