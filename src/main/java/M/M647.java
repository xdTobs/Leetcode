package M;

public class M647 {
    public static int countSubstrings(String s) {
        int result = 0;

        if (s.length() == 0) return 0;

        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {

                result++;
                r++;
                l--;


            }
            //even
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {

                result++;
                r++;
                l--;


            }

        }
return result;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abbba"));
    }
}
