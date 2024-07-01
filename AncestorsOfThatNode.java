package BinaryTree;

import java.util.*;

public class AncestorsOfThatNode {

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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int target = 5;

        List<Node> ans = getAncestors(root, target);
        for (Node k : ans) {
            System.out.print(k.data +" ");
        }
    }

    public static List<Node> getAncestors(Node node, int target) {
        List<Node> ancestors = new ArrayList<>();
        if (findAncestorsRecursive(node, target, ancestors)) {
            return ancestors;
        } else {
            return new ArrayList<>();
        }
    }

    private static boolean findAncestorsRecursive(Node current, int target, List<Node> ancestors) {
        if (current == null) return false;
        if (current.data == target) return true;
        ancestors.add(current);
        if (findAncestorsRecursive(current.left, target, ancestors) || findAncestorsRecursive(current.right, target, ancestors)) {
            return true;
        }
        ancestors.remove(current);
        return false;
    }
}