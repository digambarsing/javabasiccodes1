package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int a:A) {
            for (int b:B) {
                int sum=a+b;
                map.put(sum,map.getOrDefault(sum,0)+1);

            }

        }

        for (int c:C) {
            for (int d:D) {
                int target=-c-d;
                if(map.containsKey(target)){
                    count+=map.get(target);
                }

            }

        }
        return count;


    }

    public static void main(String[] args) {
        FourSumII solution = new FourSumII();
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        int result = solution.fourSumCount(A, B, C, D);
        System.out.println("Result: " + result);
    }
}