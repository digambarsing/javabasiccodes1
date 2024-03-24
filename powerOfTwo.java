package recursion;

import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        Boolean ans=divide(n,1);
        System.out.println(ans);
    }

    private static Boolean divide(int n, int i) {
        int a= (int) Math.pow(2,i);

        if(n==1){
            return true;
        }


        if (n%a!=0){
            return false;
        }

        divide(n,i+1);

        if(n%a==0);
        return true;
    }
}
