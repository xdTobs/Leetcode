package M;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class M567 {
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        int[] countMap = new int[26];
        Arrays.fill(countMap,0);
        int count =0;
        for (int i = 0; i < s1.length(); i++) {
            countMap[s1.charAt(i)-'a']++;
            countMap[s2.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(countMap[i]==0)
                count++;
        }
        if(count==26)
            return true;
        for (int i = s1.length(); i < s2.length(); i++) {
            // Adding new character in the window.
            int r = s2.charAt(i) - 'a';
            countMap[r]--;
            if (countMap[r] == 0) {
                count++;
            } else if (countMap[r] == -1) {
                count--;
            }

            // Removing old character from the window.
            int l = s2.charAt(i - s1.length()) - 'a';
            countMap[l]++;
            if (countMap[l] == 0) {
                count++;
            } else if (countMap[l] == 1) {
                count--;
            }

            if (count == 26) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo"));
    }


}
