package BinarySerachTree;

public class SortedArrayToBalanceBST {
    static class Node {
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
        int[] ar = {3, 5, 6, 8, 10, 11, 12};

        Node ans = builtBStT(ar);
        printBST(ans);
    }

    public static Node builtBStT(int[] ar) {
        return helper(ar, 0, ar.length - 1);
    }

    public static Node helper(int[] ar, int st, int ed) {
        if (st > ed) {
            return null;
        }
        int mid = st + (ed - st) / 2;
        Node nn = new Node(ar[mid]);

        nn.left = helper(ar, st, mid - 1);
        nn.right = helper(ar, mid + 1, ed);

        return nn;
    }

    public static void printBST(Node node) {
        if (node == null) {
            return;
        }
        printBST(node.left);
        System.out.print(node.data + " ");
       // printBST(node.left);
        printBST(node.right);
    }
}