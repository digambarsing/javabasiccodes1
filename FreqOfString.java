package HashMap;

import java.util.HashMap;

public class FreqOfString {
    public static void main(String[] args) {
        String s="apna college";

        char []c=s.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();

        for (char ch:c) {
            if(ch==' ') continue;

            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch)+1);
            }
        }
        System.out.println(map);
    }
}
