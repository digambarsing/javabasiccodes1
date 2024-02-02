package collegedsa;

import java.util.Scanner;

public class recwithsohil1 {

    static int stairways(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return 1;
        }
        if(n<0){
            return 0;
        }
       int a= stairways(n-1,ans+1);
       int b= stairways(n-2,ans+2);
       int c= stairways(n-3,ans+3);
       return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(  " total no. of ways are: "+stairways(n," "));
    }
}
