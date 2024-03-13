package linkedlist;

public class linkreverse {

    class Node{
        int data;
        Node next;
        linked_list.Node prev;

    }

    Node head=null;
    Node tail=null;
    int size;

    public void addFirst(int val){

        Node nn=new Node();
        nn.data=val;
        if(size==0){
            head=tail=nn;

        }else{
            nn.next=head;
            head=nn;

        }
        size++;
        //nn.next=null; // by default no need to set it.

    }
    public void rev(){
        Node prev=null;
        Node current=head;
        Node next;
        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

    public void Display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;

        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        linkreverse l=new linkreverse();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.addFirst(40);
        l.Display();
        l.rev();
        l.Display();


    }
}
