package collegebacktracking;

import java.util.ArrayList;
import java.util.List;

public class combinationsum {
    private static void print(int[]arr, int target, List<Integer>list, List<ArrayList<Integer>> li, int lp){
        if(target==0){
            //System.out.println(list);
            li.add(new ArrayList<Integer>(list));
            return;
        }
        if (target<0){
            return;
        }
        for (int i = lp; i < arr.length; i++) {
            list.add(arr[i]);
            print(arr,target-arr[i],list,li,i);
            list.remove(list.size()-1);


        }
    }
    public static void main(String[] args) {
        int[]arr={2,3,6,7};
        int target=7;
        List<Integer>list=new ArrayList<>();
        List<ArrayList<Integer>>li=new ArrayList<>();
        print(arr,target,list,li,0);
        System.out.println(li);

    }
}
