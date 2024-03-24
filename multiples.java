package recursion;

import java.util.Scanner;

public class multiples {

    static  int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();

        multiple(1,n,k,"");
    }

    private static void multiple(int i, int n, int k, String s) {
        if(count==k){
            System.out.println(s);
            return;
        }

        if (i%n==0){
            count++;
            multiple(i+1,n,k,s+" ,"+i);
        }else{
            multiple(i+1,n,k,s);
        }
    }
}
