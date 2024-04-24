package stacks;

import java.util.Stack;

public class stackinsert {
    public static void main(String[] args) {
        Stack<Integer> a=new Stack<>();
        Stack<Integer> b=new Stack<>();
        Stack<Integer> c=new Stack<>();

        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        int idx=2;


        while(a.size()>idx){
            b.push(a.pop());
        }
        System.out.println("used stack:"+b);

        a.push(5);

        while (b.size()>0){
            a.push(b.pop());
        }
        System.out.println(a);

    }
}
