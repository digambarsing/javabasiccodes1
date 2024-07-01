package BinaryTree;

public class MiniDistBwNodes  {
    public static  class Node{
        int data;

        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node lca2(Node root, int n1, int n2) {
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftlca=lca2(root.left, n1, n2);
        Node rightlca=lca2(root.right, n1, n2);

        if(rightlca==null){
            return leftlca;
        }

        if (leftlca==null){
            return rightlca;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4;
        int n2 = 6;

        System.out.println("minimum distance between nodes is  "+minDist(root,n1,n2));

    }

    private static int minDist(Node root, int n1, int n2) {

        Node node=lca2(root,n1,n2);

        int leftdist=lcadist(node,n1);

        int rightdist=lcadist(node,n2);

        return leftdist+rightdist;

    }

    private static int lcadist(Node node, int n) {
        if(node==null){
            return -1;
        }
        if(node.data==n){
            return 0;
        }
        int left=lcadist(node.left, n);
        int right=lcadist(node.right, n);

        if(left==-1  && right==-1){
            return -1;
        } else if (right==-1) {
            return left+1;

        }else {
            return right+1;
        }

    }
}
