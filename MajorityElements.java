package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElements {
    public static void main(String[] args) {
//        int[] ar = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int[]ar={1,2};
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(majority(ar, ans));
    }

    public static ArrayList<Integer> majority(int[] ar, ArrayList<Integer> ans) {

        int n= ar.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : ar) {
            if (!map.containsKey(ele)) {
                map.put(ele, 1);
            } else {
                map.put(ele, map.get(ele) + 1);
            }
        }

       for(int ele:map.keySet()){

           if(map.get(ele)>n/3){
               ans.add(ele);
           }
       }
        return ans;
    }
}
