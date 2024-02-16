package collegebacktracking;

import java.util.Arrays;

public class chANgearray {
    public static void main(String[] args) {
        int []arr=new int[5];
        arrayfun(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void arrayfun(int[] arr, int i) {
        if(i==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        arr[i]=i+1;
        arrayfun(arr,i+1);
        arr[i]=arr[i]-2; // backtracking
    }
}
