package BinaryTree;

import java.util.ArrayList;

public class LowestCommonAncestors {

    public static class Node {
        int data;
        Node left, right;

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
        int n1 = 4;
        int n2 = 6;

        Node ans = lca(root, n1, n2);
        if (ans != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is " + ans.data);
        } else {
            System.out.println("LCA does not exist");
        }

        Node ans1=lca2(root,n1,n2);
        System.out.println(ans1.data+" ");
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

    private static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // Check if both n1 and n2 are present in the tree
        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
            return null; // Return null if either n1 or n2 is not present
        }

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (!path1.get(i).equals(path2.get(i))) {
                break;
            }
        }

        return path1.get(i - 1);
    }

    private static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        if (root.left != null && getPath(root.left, n, path)) {
            return true;
        }

        if (root.right != null && getPath(root.right, n, path)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }
}
