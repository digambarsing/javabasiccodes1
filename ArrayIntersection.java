package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[]A={4,9,5};
        int[]B={9,4,9,8,4};
        ArrayList<Integer>ans=intersectionPoint(A,B);
        System.out.println(ans);
    }

    public static ArrayList<Integer> intersectionPoint(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }



        return list;
    }
    }

