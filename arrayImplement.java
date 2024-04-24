package stacks;

import java.util.Stack;

// import static stacks.arrayImplement.stacks.display;

public class arrayImplement {

    private static class stacks {

        int[] ar = new int[5];
        int i = 0;
        int size = 0;

        public void push(int data) {
            if(isFull()){
                System.out.println("overflow");
            }
            ar[i] = data;
            i++;
            size++;
        }

        public int pop() {
            if (i == 0) {
                System.out.println("underflow");
                return -1;
            }
            int tos = ar[i - 1];
            i--;
            size--;
            return tos;

        }

        public int peek() {
            if (i == 0) {
                System.out.println("underflow");
                return -1;
            }
            return ar[i - 1];

        }


        public int size() {
            return i;
        }

        public void display() {
            for (int j = 0; j <=i-1; j++) {
                System.out.print(ar[j]+" ");
            }
            System.out.println();
            }

        public void isEmpty() {
            if(i==0){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }

        public boolean isFull() {
            if(i== ar.length){
                return true;
            }
            return false;
        }
    }


    public static void main(String[] args) {
        stacks s = new stacks();
        s.isEmpty();
        s.push(3);
        s.display();
        s.push(2);
        s.display();
        s.push(1);
        s.display();
        s.pop();
        s.display();
        int top = s.peek();
        System.out.println(top);
        s.display();
        s.isEmpty();
        System.out.println(s.isFull());


    }
}


