package searchalggo;

import java.util.Arrays;
import java.util.Scanner;

public class recbinrysrch {

    // it is a recursive binry search.


    static boolean recbin(int[]arr,int start,int end,int target){

        // base case
        if(start>=end){
            return false;
        }

        int mid=(start+end)/2;


        // int thi cas(int mid=(start+end)/2;), overflow can occur
        // so to find middle there is a best way that is
        // start+(end-start)/2;

        if(arr[mid]==target){
            return true;
        } else if (arr[mid]>target) {
            return (recbin(arr,start,mid-1,target));

        }
        else{
            return (recbin(arr,mid+1,end,target));
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int m= sc.nextInt();

        int arr[]=new int[m];

        for (int i = 0; i < m; i++) {
            arr[i]= sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println(  recbin(arr,0, arr.length-1,n ));

    }
}
