package BinarySerachTree;

public class DeleteNode extends Traversal {
    public static void main(String[] args) {
        int[]values={8,5,3,1,4,6,10,11,14};
        Node root=null;
        int value=7;
        for (int val: values) {
            root = insertNode(root, val);
        }
       if(foundKey(root,value)){
           Node ans=deleteNode(root,value);
           Inorder(ans);
       }else{
           System.out.println("Value is not present");
       }
    }

    private static boolean foundKey(Node root, int target) {
        if(root==null){
            return false;
        }
        if(root.data==target){
            return true;
        }
        if(target< root.data){
            return foundKey(root.left, target);
        }else{
            return foundKey(root.right, target);
        }
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
    private static Node deleteNode(Node root, int value) {
        if(root==null){
            return null;
        }
        if(root.data>value){
            root.left=deleteNode(root.left, value);
        } else if (root.data<value) {
            root.right=deleteNode(root.right, value);
        }else{
            if(root.left==null && root.right==null){
                return null;
            } else if (root.left==null) {
                return root.right;

            }else if (root.right==null) {
                return root.left;

            }
            else{
                Node Is=FindInorderSuccessor(root.right);
                root.data=Is.data;
                root.right=deleteNode(root.right, Is.data);
            }
        }
        return root;
    }

    public static Node FindInorderSuccessor(Node right) {
        while (right!=null){
            right=right.left;
        }
        return right;
    }
}
