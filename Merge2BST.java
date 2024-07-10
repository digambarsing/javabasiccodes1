package BinarySerachTree;

import BinaryTree.HeightOfTree;

import java.util.ArrayList;

public class Merge2BST  extends SortedArrayToBalanceBST{
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
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);

        ArrayList<Integer>path1=new ArrayList<>();
        Inorder(root1,path1);
        ArrayList<Integer>path2=new ArrayList<>();
        Inorder(root2,path2);



        int size = path1.size() + path2.size();
        int p1 = 0;
        int p2 = 0;

        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            if (p1 == path1.size()) {
                ar[i] = path2.get(p2++);
            } else if (p2 == path2.size()) {
                ar[i] = path1.get(p1++);
            } else if (path1.get(p1) > path2.get(p2)) {
                ar[i] = path2.get(p2++);
            } else {
                ar[i] = path1.get(p1++);
            }
        }

       SortedArrayToBalanceBST.Node ans= builtBStT(ar);
        printBST(ans);


    }

    public static void Inorder(Node root, ArrayList<Integer> path) {
        if (root==null){
            return;
        }
        Inorder(root.left, path);
        path.add(root.data );
        Inorder(root.right, path);
    }
}
