package collegedsa;

import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        sub(arr,0,list,res,0);
        System.out.println(res);
    }

    private static void sub(int[] arr, int i,ArrayList<Integer>list,ArrayList<ArrayList<Integer>> res,int lp) {


        res.add(new ArrayList<>(list));
        for (int j = lp; j < arr.length; j++) {
            list.add(arr[j]);
            sub(arr,i+1,list,res,j+1);
            list.remove(list.size()-1);


        }
    }
}
