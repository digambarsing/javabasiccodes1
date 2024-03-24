package recursion;

import java.util.Scanner;

public class maxvalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int[]ar=new int[n];
//        for (int i = 0; i < n; i++) {
//            ar[i]= sc.nextInt();
//
//        }

        int[]ar={509,967,1028,764,37};

        int ans=max(0,ar);
        System.out.println(ans);
    }

    private static int max(int i, int[] ar) {
        if(i== ar.length-1){
            return ar[i];
        }

        int sans=max(i+1,ar);
        return Math.max(ar[i],sans);
    }
}
