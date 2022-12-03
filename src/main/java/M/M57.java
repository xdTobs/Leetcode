package M;

public class M57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        boolean startInInterval = false;
        for (int[] interval : intervals){
            if (newInterval[0]>interval[0]&&newInterval[0]<interval[1]){
                startInInterval = true;
                break;
            }
        }
        if (startInInterval){

        }
        return null;
    }
}
