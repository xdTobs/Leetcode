package L;

public class L191 {
    public int hammingWeight(int n) {
        int res =0;
        int mask =1;
        for (int i = 0; i < 32; i++) {
            if((n&mask)!=0){
                res++;
            }
            n>>=1;
        }
        return res;
    }
}
