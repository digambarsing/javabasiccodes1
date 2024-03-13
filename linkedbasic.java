package linkedlist;

import java.util.LinkedList;
import java.util.*;

public class linkedbasic {

    public static class Node{
        int data;
        Node next;


        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static int size;



    public void addFirst(int data){
        Node newnode=new Node(data);
        size++;

        if(head==null){
            head=tail=newnode;
            return;
        }

        newnode.next=head;

        head=newnode;
    }

    public void addLast(int data){
        Node nenode=new Node(data);
        size++;

        if(head==null){
            head=tail=nenode;
            return;
        }

        tail.next=nenode;

        tail=nenode;
    }

    public  void Print(){

        if (head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;

        while (temp!=null){
            System.out.println(temp.data+"-->");
            temp=temp.next;


        }
        System.out.println();
    }

    public void add(int index,int data){
        if (index==0){
            addFirst(data);
            return;
        }
        Node newniode=new Node(data);
        size++;

        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }

        newniode.next=temp.next;
        temp.next=newniode;
    }

    public int removeFirst(){
        if (size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            return val;

        }
        int val=head.data;
        head=head.next;
        return val;
    }

    public int removeLast(){
        if (size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;

        }
        Node prev=head;
       for (int i=0;i<size-2;i++){
           prev=prev.next;
       }
       int val=prev.next.data;
       prev.next=null;
       tail=prev;
       size--;
       return val;
    }

    public int itrsearch(int key){
        Node t=head;
        int i=0;

        while(t!=null){
            if (t.data==key){
                return i;
            }
            t=t.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {


        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.add(2,5);






        System.out.println(ll);
        System.out.println(ll.removeFirst());
      //  System.out.println(ll.itrsearch(3));

    }
}
