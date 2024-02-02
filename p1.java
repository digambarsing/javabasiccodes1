package sigma;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j = i; j <=n ; j++) {// for(int j=1;j<=n+1-i;j++0
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
