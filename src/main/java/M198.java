public class M198 {
    public int rob(int[] nums) {
int rob1=0,rob2=0,temp=0;
        for (int n : nums){
            temp = Integer.max(n+rob1,rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}
