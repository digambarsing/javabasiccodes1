package BinarySerachTree;

public class Traversal {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(5);
        root.left.left=new Node(1);
        root.left.right=new Node(3);
        root.right.right=new Node(6);

        Inorder(root);
    }


    // inorder traversal gave sorted sequence in case of bst.
    public static void Inorder(Node root) {

        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
}
