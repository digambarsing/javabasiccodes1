package sigma;

import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        while ( m>0){
            int r=m%10;
            System.out.print(r);
            m/=10;
        }
        System.out.println(" ");
        int org =n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);

        int t=0;

        do {
            System.out.println(t);
            t+=1;


        }while(t<0);
    }
}
