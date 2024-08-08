package HashMap;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map=new HashMap<>();
        for (String str:strs) {
            char []ch=str.toCharArray();
            Arrays.sort(ch);
            String sortedstring=new String(ch);
            if(!map.containsKey(sortedstring)){
                map.put(sortedstring,new ArrayList<>());
            }
            map.get(sortedstring).add(str);

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagram solution = new GroupAnagram();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat","tab"};
        List<List<String>> result = solution.groupAnagrams(strs);

        for (List<String> anagrams : result) {
            System.out.println(anagrams);
        }
    }
}
