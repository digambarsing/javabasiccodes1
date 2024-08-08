package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (map.containsKey(sc)) {
                if (map.get(sc) != tc) {
                    return false;
                }
            } else {
                if (map.containsValue(tc)) {
                    return false;
                }
                map.put(sc, tc);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        boolean result = isIsomorphic(s, t);

        System.out.println("Are the strings isomorphic? " + result);
    }
}
