package linkedlist;

public class linked_list {

    class Node{
        int data;
        Node next;
        Node prev;

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

    public void addLast(int val){



        if(size==0){
           addFirst(val);
        }
        else{
            Node nn=new Node();
            nn.data=val;
            tail.next=nn;

            tail=nn;
            size++;
        }
    }

    public void addatKthPos(int val,int k){
        if(k==0){
            addFirst(val);
        }else if(k==size){
            addLast(val);
        }else {
            Node temp=getNode(k);
            Node temp2=temp.next;
            Node nn=new Node();
            nn.data=val;
            temp.next=nn;
            nn.next=temp2;
            size++;
        }
    }
    public Node getNode(int k){
        Node temp=head;
        for (int i = 1; i <k ; i++) {
            temp=temp.next;

        }
        return temp;
    }

    public int getFirstData() {
        if (head != null) {
            return head.data;
        } else {

            return -1;
        }
    }

    public int getLastData() {
        if (size!=0) {
            return tail.data;
        } else {

            return -1;
        }
    }

    public int getKthData(int k) {
        if (size!=0) {
            return getNode(k).data;
        } else {

            return -1;
        }
    }

    public void removeFirst() {
        if (head != null) {
            Node temp=head;
            head = head.next;
            temp.next=null;
            size--;
        }
    }

    public void removeLast() {
        Node last=getNode(size-1);
        last.next=null;
        tail=last;
        size--;

    }
    public void delkthpos(int k){
        Node temp=getNode(k-1);
        Node temp2=temp.next;

        size--;

    }
    public int size(){
        return size();
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
        linked_list l=new linked_list();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.addFirst(40);

        l.addLast(50);

        l.Display();
        l.addatKthPos(60,3);
        l.Display();
        l.removeFirst();
        l.Display();
        l.removeLast();
        l.Display();
        l.delkthpos(1);
        l.Display();


    }
}
