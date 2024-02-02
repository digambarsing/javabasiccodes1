package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int k=0;k<n;k++){
            arr[k]= sc.nextInt();
        }
        for (int i=0;i<n-1;i++){
            // to optimize the performance of this for best case
            boolean flag=false;
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    flag=true;
                }
            } // this sorting is stable and in place(means do not use more space than array size
            // ).
//            if(flag == false){
//                return;
//            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
