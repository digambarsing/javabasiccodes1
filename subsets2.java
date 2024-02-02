package collegebacktracking;

import java.util.ArrayList;

public class subsets2 {
    public static void main(String[] args)
    {
        int[]arr={1,2,2};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        boolean[] used= new boolean[3];
        sub(arr,used,0,list,res,0);
        System.out.println(res);
    }

    private static void sub(int[] arr,boolean[]used, int i,ArrayList<Integer>list,ArrayList<ArrayList<Integer>> res,int lp) {




            if (res.contains(list)==false){
                res.add(new ArrayList<>(list));
            }
        for (int j = lp; j < arr.length; j++) {
            list.add(arr[j]);
            sub(arr,used,i+1,list,res,j+1);
            list.remove(list.size()-1);



        }
    }
}
