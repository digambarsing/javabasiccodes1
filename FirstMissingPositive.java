package HashSet;

import java.util.HashSet;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        System.out.println(missingPositive(arr));
    }

    private static int missingPositive(int[] arr) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int i=1;
        while (true){
            if (!set.contains(i)){
                return i;
            }
            i++;
        }
    }
}
