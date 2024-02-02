package array_2D;

import java.util.Scanner;

public class pascaltriangle {

    static void printarray(int[][]ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");

            }
            System.out.println();

        }
    }

    static void pascal(int n){

        int ans[][]=new int[n][];

        for (int i = 0; i < n; i++) {

            // i row har i+1 col,

            ans[i]=new int[i+1];

            // 1 and last element is 1

            ans[i][0]=ans[i][i]=1;

            for (int j = 1; j < i; j++) {
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];

            }

        }
        printarray(ans);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
       pascal(n);



    }
}
