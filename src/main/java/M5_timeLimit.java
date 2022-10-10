import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class M5_timeLimit {
    public static String longestPalindrome(String s) {
        String result = new String();
        boolean containsdoubles = false;
        int L = 0, R = 0;
        HashMap<Character, List<Integer>> processedChars = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {


            if (processedChars.containsKey(s.charAt(i))){
                for (int j = 0; j < processedChars.get(s.charAt(i)).size(); j++) {



                    if (helper(s.substring(processedChars.get(s.charAt(i)).get(j), i + 1)) && i + 1 - processedChars.get(s.charAt(i)).get(j) > result.length()) {
                        containsdoubles = true;
                        result = s.substring(processedChars.get(s.charAt(i)).get(j), i + 1);
                    }
                }
                List<Integer> temp = new ArrayList<>();
                temp = processedChars.get(s.charAt(i));
                temp.add(i);
                processedChars.put(s.charAt(i), temp);
            }
            else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                processedChars.put(s.charAt(i), temp);
            }



        }
        if (!containsdoubles) result = s.substring(0,1);
        return result;
    }
    public static boolean helper(String s) {

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
        System.out.println(longestPalindrome("ccc"));
    }
}
