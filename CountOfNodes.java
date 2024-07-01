package BinaryTree;

public class CountOfNodes extends HeightOfTree{

    public static int count(Node root){
        if (root==null){
            return 0;
        }
//       int lc=count(root.left);
//        int rc=count(root.right);
//        int totalCount=lc+rc+1;
//        return totalCount;

        return count(root.left)+count(root.right)+1;
    }



    public static int sum(Node root){
        if (root==null){
            return 0;
        }
        return sum(root.left)+sum(root.right)+root.data;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

   //    System.out.println(count(root));
     //   System.out.println(height(root));

        System.out.println(sum(root));

    }
}
