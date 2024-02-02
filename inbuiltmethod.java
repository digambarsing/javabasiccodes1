package sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class inbuiltmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();

        }

       // Arrays.sort(arr);

        //System.out.println(Arrays.toString(arr));

      //  Arrays.sort(arr,0,3);

       // System.out.println(Arrays.toString(arr));


//        we use collection method to sort a array in reverse order.
//                but it works on only object not primitive datatype.


        Integer ar[]={67,98,34,76,15};


        Arrays.sort(ar,Collections.reverseOrder());

        System.out.println(Arrays.toString(ar));

    }
}
