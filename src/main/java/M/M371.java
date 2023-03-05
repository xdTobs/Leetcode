package M;

public class M371 {
    public int getSum(int a, int b) {
        int oldA;
        while(b!=0){
            oldA =(a&b)<<1;
            a=a^b;
            b=oldA;
            
        }
        return a;
    }

    public static void main(String[] args) {
        M371 sol = new M371();
        System.out.println(sol.getSum(3,1));

    }

}
