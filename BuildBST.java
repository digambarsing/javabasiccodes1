package BinarySerachTree;

public class BuildBST  extends Traversal {
    public static void main(String[] args) {
        int[]values={5,1,3,4,2,7};
        Node root=null;
        for (int val:values){
          root= BuildBSTTree(root,val);

        }
        Inorder(root);

    }

    private static Node BuildBSTTree(Node root, int val) {
        if(root==null){
            return new Node(val);
        }
        if(root.data>val){
            root.left=BuildBSTTree(root.left, val);
        }else{
            root.right=BuildBSTTree(root.right, val);
        }
        return root;
    }
}
