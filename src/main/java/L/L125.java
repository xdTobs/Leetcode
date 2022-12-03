package L;

public class L125 {
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        String[] parts = s.split("[^a-z0-9]");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            builder.append(parts[i]);
        }
        s = builder.toString();
        if (s.length()<=1)return true;
        for (int i = 0; i < s.length()/2; i++) {
            if (!(s.charAt(i)==s.charAt(s.length()-i-1)))return false;
        }
return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}

