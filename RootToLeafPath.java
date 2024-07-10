package BinarySerachTree;

import java.util.ArrayList;

public class RootToLeafPath  extends PrintInRange{
    public static void main(String[] args) {
        int[] values = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for (int val : values) {
            root = insertNode(root, val);
        }
        Inorder(root);
        System.out.println();
        printAllPaths(root, new ArrayList<>());
    }

    public static Node insertNode(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insertNode(root.left, value);
        } else if (value > root.data) {
            root.right = insertNode(root.right, value);
        }

        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void printAllPaths(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (isLeafNode(root)) {
            printPath(path);
        } else {
            printAllPaths(root.left, path);
            printAllPaths(root.right, path);
        }

        path.remove(path.size() - 1);  // Backtrack
    }

    public static boolean isLeafNode(Node root) {
        return root.left == null && root.right == null;
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int value : path) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

