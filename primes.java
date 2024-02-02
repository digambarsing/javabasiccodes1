package sigma;

import java.util.Scanner;

public class primes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int i=1;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count>2){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}
