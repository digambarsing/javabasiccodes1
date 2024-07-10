package BinarySerachTree;

public class KeySearch extends Traversal {
    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(5);
        root.left.left=new Node(1);
        root.left.right=new Node(3);
        root.right.right=new Node(6);

        int target=7;

        boolean ans=foundKey(root,target);
        boolean ans1=FoundItereative(root,target);
        if(ans){
            System.out.println("Key is found:" + target);
        }else{
            System.out.println("Key is not found:");
        }
        if(ans1){
            System.out.println("Key is found:" + target);
        }else{
            System.out.println("Key is not found:");
        }

    }

    public static boolean FoundItereative(Node root, int target) {
        Node current=root;

        while (current!=null){
            if(current.data==target){
                return true;
            }
            if(current.data>target){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        return false;
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
}
