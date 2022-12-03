package M;

public class M91 {
    public static int numDecodings(String s) {
        if (s.length() == 0||Character.getNumericValue(s.charAt(0))==0)return 0;
return helper(s,0);
    }
    public static int helper(String s,int i){
        if (i==s.length())return 1;
        if (Character.getNumericValue(s.charAt(i))>2||i+1==s.length())return helper(s,i+1);
        int nextVal = Character.getNumericValue(s.charAt(i + 1));
        if ((Character.getNumericValue(s.charAt(i))==2&& nextVal >6)||(Character.getNumericValue(s.charAt(i))==1&& nextVal ==0))return helper(s,i+2);

int count =0;

count += helper(s,i+1);
count += helper(s,i+2);
return count;





    }

    public static void main(String[] args) {
        System.out.println(numDecodings("2101"));
    }
}
