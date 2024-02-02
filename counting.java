package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class counting {
    static void count(int[]arr){
        // maximum no. find
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            max=Math.max(max,arr[i]);

        }


        int[]count=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;

        }

        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int k=0;k<n;k++){
            arr[k]= sc.nextInt();
        }

        count(arr);
        System.out.println(Arrays.toString(arr));
    }
}
