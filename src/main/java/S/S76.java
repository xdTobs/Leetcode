package S;

import java.util.HashMap;

public class S76 {
    public static String minWindow(String s, String t) {
        int l = 0, r = 0;
        String res = "";
        boolean validWindow;
        HashMap<Character, Integer> charInT = new HashMap<>(), window = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            charInT.put(t.charAt(i), charInT.getOrDefault(t.charAt(i), 0) + 1);

        }

        while (r < s.length()) {
            window.put(s.charAt(r), window.getOrDefault(s.charAt(r), 0) + 1);

            while (!(l==s.length())&&charInT.getOrDefault(s.charAt(l), 0) < window.getOrDefault(s.charAt(l), 0)) {
                window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                l++;


                validWindow = true;
                for (Character key : charInT.keySet()) {
                    if (charInT.get(key) > window.getOrDefault(key, 0)) {
                        validWindow = false;
                    }
                }
                if (validWindow) {
                    String possibleRes = s.substring(l, r + 1);
                    if (possibleRes.length() < res.length() || res.length() == 0)
                        res = possibleRes;


                }

            }
            validWindow = true;
            for (Character key : charInT.keySet()) {
                if (charInT.get(key) > window.getOrDefault(key, 0)) {
                    validWindow = false;
                }
            }
            if (validWindow) {
                String possibleRes = s.substring(l, r + 1);
                if (possibleRes.length() < res.length() || res.length() == 0)
                    res = possibleRes;


            }
            r++;

        }


        return res;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("a", "b"));
    }
}
