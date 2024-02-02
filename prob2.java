package searchalggo;

import java.util.Arrays;

public class prob2 {


    //   find square root of number with binary search.

    static void sqbin(int []arr,int n){

        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            int val=mid*mid;

            if (val==n){
                System.out.println(mid);
                return;
            } else if (val>n) {
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        System.out.println(" sqrt not exist");

    }
    public static void main(String[] args) {


        int aee[]={8,2,6,4,18,12,16,14};

        Arrays.sort(aee);

        System.out.println(Arrays.toString(aee));

        sqbin(aee,17);

    }
}
