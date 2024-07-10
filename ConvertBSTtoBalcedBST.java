package BinarySerachTree;

import java.util.ArrayList;
import java.util.List;

public class ConvertBSTtoBalcedBST {
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
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(1);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);

        Node ans=binaryTreeToBalancedBST(root);
        System.out.println(ans.data);
    }

    public static Node binaryTreeToBalancedBST(Node root) {
        List<Integer> sortedArray = new ArrayList<>();
        inorderTraversal(root, sortedArray);

        return sortedArrayToBalancedBST(sortedArray, 0, sortedArray.size() - 1);
    }

    private static void inorderTraversal(Node node, List<Integer> sortedArray) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, sortedArray);
        sortedArray.add(node.data);
        inorderTraversal(node.right, sortedArray);
    }

    private static Node sortedArrayToBalancedBST(List<Integer> sortedArray, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Node node = new Node(sortedArray.get(mid));

        node.left = sortedArrayToBalancedBST(sortedArray, start, mid - 1);
        node.right = sortedArrayToBalancedBST(sortedArray, mid + 1, end);

        return node;
    }


}
