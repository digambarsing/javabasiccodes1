package BinaryTree;

public class DiameterOfTree extends HeightOfTree {



    // approach 1:-
    public static int Diameter(Node root){
        if (root==null){
            return 0;
        }
        int lh= height(root.left);
        int rh= height(root.right);
        int ld=Diameter(root.left);
        int rd=Diameter(root.right);

//        int selfD=lh+rh+1;
//
//       int maxD=  Math.max(ld,rd) ;
//       return Math.max(maxD,selfD);

        return Math.max(Math.max(ld,rd),lh+rh+1);
    }


    // approach 2:-


    static class Info{


        int diameter;
        int height;


        public Info(int diameter,int height){
            this.diameter=diameter;
            this.height=height;
        }



    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

        System.out.println(Diameter(root));

        System.out.println(Diameter2(root).diameter);

    }

    public static Info Diameter2(Node root) {
        if (root==null){
            return new Info(0,0);
        }

        Info left=Diameter2(root.left);
        Info rigth=Diameter2(root.right);

        int diam=Math.max(Math.max(left.diameter, rigth.diameter), left.height+ rigth.height+1);

        int height=Math.max(left.height, rigth.height)+1;

        return new Info(diam, height);
    }
}
