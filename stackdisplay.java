package stacks;

import java.util.Stack;

public class stackdisplay {
    public static void main(String[] args) {
        Stack<Integer> a=new Stack<>();
        Stack<Integer> b=new Stack<>();
        Stack<Integer> c=new Stack<>();

        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        reversedisplay(a);
        System.out.println(" ");
        display(a);
    }

    private static void reversedisplay(Stack<Integer> a) {
        if(a.size()==0){
            return;
        }
        int top=a.pop();
        System.out.print(top+" ");
        reversedisplay(a);
        a.push(top);

    }


    private static void display(Stack<Integer> a) {
        if(a.size()==0){
            return;
        }
        int top=a.pop();
        display(a);

        System.out.print(top+" ");
        a.push(top);

    }
}
