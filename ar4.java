package self;

import java.util.Arrays;

public class ar4 {
    // array contain only zeros and ones

    static void onezerosort(int[]arr){

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                count++;
            }

        }
        for (int i = 0; i < count ; i++) {
            arr[i]=0;

        }
        for (int i = count; i < arr.length-1 ; i++) {
            arr[i]=1;

        }
        System.out.println(Arrays.toString(arr));

    }


    static void oneswithiandj(int[]arr){
        int i=0;
        int j= arr.length-1;

        while(i<j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }


            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int []ar={0,0,0,1,1,0,1,0,1};

      //  onezerosort(ar);

        oneswithiandj(ar);

    }
}
