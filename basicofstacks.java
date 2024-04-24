package stacks;

import java.util.Stack;

public class basicofstacks {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st);
        System.out.println("size is:"+st.size());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.isEmpty());
        st.push(5);
        st.push(6);
        System.out.println(st);
        System.out.println("size is:"+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);


        while (st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);

    }
}
