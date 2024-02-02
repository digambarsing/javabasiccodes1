package searchalggo;

import java.util.Arrays;
import java.util.Scanner;

public class binsearch {

    static int binary(int[]arr,int n){


        Arrays.sort(arr);


        System.out.println(Arrays.toString(arr));


        int start=0;
        int end= arr.length-1;

        while (start<=end){

            int mid=(start+end)/2;

            if(arr[mid]==n){
              return mid;
            }


            if(arr[mid]<n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
       return -1;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int []arr={56,78,45,32,76,5,90,100,26,13,289};
        int n=sc.nextInt();
        System.out.println( binary(arr,n));

    }
}
