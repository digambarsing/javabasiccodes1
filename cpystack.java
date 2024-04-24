package stacks;

import java.util.Scanner;
import java.util.Stack;

public class cpystack {
    public static void main(String[] args) {

//        user input

        Stack<Integer> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            s.push(sc.nextInt());
        }

        System.out.println(s);







        Stack<Integer> a=new Stack<>();
        Stack<Integer> b=new Stack<>();
        Stack<Integer> c=new Stack<>();

        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        System.out.println(a);

        while(a.size()>0){
            b.push(a.pop());
        }
        System.out.println("used stack:"+b);

        while (b.size()>0){
            c.push(b.pop());
        }
        System.out.println("copy of a is:"+c);


    }
}
