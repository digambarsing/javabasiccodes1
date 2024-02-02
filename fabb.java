package collegedsa;

import java.util.Scanner;

public class fabb {

    static int series(int n){
        if(n==0||n==1){
            return n;
        }

            return series(n-1)+series(n-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println(series(n));

        for (int i = 0; i <= n; i++) {
            System.out.println(series(i));

        }


        // if more than one recursive call than we use recursion tree instead of call stack.

        // time complexity is 2**n;
    }
}
