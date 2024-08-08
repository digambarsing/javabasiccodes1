package HashMap;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber {
        public static int findDuplicate(int[] nums) {
            HashMap<Integer,Integer>map=new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int key = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue()>1) {
                    key = entry.getKey();
                    break;
                }
            }
            return key;
        }

    public static void main(String[] args) {
       int[] nums = {1,3,4,2,2};
      // findDuplicate(nums);
        System.out.println(findDuplicate(nums));
    }
}
