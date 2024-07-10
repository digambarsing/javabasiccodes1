package BinarySerachTree;

public class PrintInRange  extends DeleteNode {
    public static void main(String[] args) {
        int[]values={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for (int val: values) {
            root = insertNode(root, val);
        }
        Inorder(root);
        System.out.println();
        printRange(root,5,12);
    }

    public static void printRange(Node root,int k1,int k2){
        if (root==null){
            return ;
        }
        if(k1<=root.data  && root.data<=k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printRange(root.right, k1, k2);
        } else if (root.data>k2) {
            printRange(root.right, k1, k2);
        }else{
            printRange(root.left, k1, k2);
        }
    }
}
