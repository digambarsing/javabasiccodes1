package BinaryTree;

import java.util.Scanner;

public class levelOfThatNode {

    // in this code we print the level of that data;

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);

        for (int i = 0; i < 3; i++) {

           int target=sc.nextInt();
            int level = printLevel(root, target);
            System.out.println("Level of that particular target is :"+ level);
        }

//        int target = 80;
//        int level = printLevel(root, target);
//        System.out.println("Level of that particular target is :"+ level);
    }

    public static boolean checkTarget(int target,Node root){
        if(root==null){
            return false;
        }
        if(root.data==target){
            return true;
        }
        return checkTarget(target,root.left) || checkTarget(target,root.right);

    }

    public static int printLevel(Node node, int target) {
        if(checkTarget(target,node)==false){
            return -1;

        }
        if (node == null) {
            return -1;
        }
        return getLevelRecursive(node, target, 0);
    }

    private static int getLevelRecursive(Node current,  int target, int level) {
        if (current == null) {
            return -1;
        }
        if (current.data == target) {
            return level;
        }
        int leftLevel = getLevelRecursive(current.left,  target, level + 1);
        if (leftLevel != -1) {
            return leftLevel;
        }
        return getLevelRecursive(current.right,  target, level + 1);
    }
}