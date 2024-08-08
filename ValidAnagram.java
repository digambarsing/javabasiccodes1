package HashMap;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s="dhirahganull";
        String t="rahulgandhi";

        System.out.println(valid(s,t));

    }

    private static boolean valid(String s, String t) {
        char[]c=s.toCharArray();

        HashMap<Character,Integer>map=new HashMap<>();
        for (char ch:c) {
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch, map.get(ch)+1);
            }

        }
        for (int i = 0; i < t.length(); i++) {
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }

        }
        return map.isEmpty();

    }
}
