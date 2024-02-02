package searchalggo;

import java.util.Arrays;
import java.util.Scanner;


import java.util.*;

public class search {
    static void linear(int[]arr,int n){
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                ans=i;

            }

        }
        System.out.println(ans);

    }



    static void binary(int[]arr,int n){


        Arrays.sort(arr);


        System.out.println(Arrays.toString(arr));


        int start=0;
        int end= arr.length-1;

        while (start<=end){

            int mid=(start+end)/2;

            if(arr[mid]==n){
                System.out.println(mid);
            }


            if(arr[mid]<n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int []arr={2,4,6,8,10,12,14,16,18,20};
       // linear(arr,n);


        int []ar={45,78,12,65,23,98,38,84,57};


        binary(ar,n);

    }
}
