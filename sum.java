package collegedsa;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(sums(n));
    }

    private static int sums(int n) {
        if(n==1){
            return 1;
        }
        return n+sums(n-1);

    }
}
