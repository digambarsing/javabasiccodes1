package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTreeWithPreorder {

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

    static class BinaryTree {

        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node nn = new Node(nodes[index]);
            nn.left = buildTree(nodes);
            nn.right = buildTree(nodes);


            return nn;
        }

        public static void preOrder(Node root) {

            if (root == null) {
                //  System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }


        public static void inOrder(Node root) {
            if (root == null) {
                //  System.out.print("-1 ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                //  System.out.print("-1 ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }

        public static void levelOrder(Node root) {

            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        q.add(curr.left);
                    }

                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }


        public static void main(String[] args) {
            int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree bt = new BinaryTree();

            Node roortNode = bt.buildTree(nodes);

          //   System.out.println(roortNode.data);

            //  bt.preOrder(roortNode);


          //   bt.inOrder(roortNode);

            // bt.postOrder(roortNode);

          //  bt.levelOrder(roortNode);
        }
    }
}
