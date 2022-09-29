import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class L242 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())return false;
        HashMap<Character,Integer> values = new HashMap<Character,Integer>();
        HashMap<Character,Integer> valuet = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            values.put(s.charAt(i),values.getOrDefault(s.charAt(i),0)+1);
            valuet.put(t.charAt(i),valuet.getOrDefault(t.charAt(i),0)+1);

        }
        if (values.equals(valuet))return true;
        else return false;
    }

}
