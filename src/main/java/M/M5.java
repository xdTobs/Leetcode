package M;

public class M5 {

    public static String longestPalindrome(String s) {
        String result = "";
        int resLen = 0;
        if (s.length()==0) return "";

        for (int i = 0; i < s.length(); i++) {
            int l=i,r=i;
            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){

                if (r-l+1>resLen){
                    result = s.substring(l,r+1);
                    resLen = r-l;

                }
                r++;
                l--;


            }
            //even
             l=i;
            r=i+1;
            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){

                if (r-l+1>resLen){
                    result = s.substring(l,r+1);
                    resLen = r-l;

                }
                r++;
                l--;


            }

        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbba"));
    }
}
