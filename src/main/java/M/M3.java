package M;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class M3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int L = 0, R = 0, longSubstring = 1;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        while (R < s.length()) {

            if (!map.containsKey(s.charAt(R))) {
                map.put(s.charAt(R), R);
                R++;
                if (R - L > longSubstring) longSubstring = R - L;
            } else {
                if (R - L > longSubstring) longSubstring = R - L;
                L = map.get(s.charAt(R)) + 1;
                R = L;
                map = new HashMap<Character, Integer>();

            }


        }
        return longSubstring;
    }
}
