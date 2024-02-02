package collegebacktracking;

public class modifyqueen {
    public static void main(String[] args) {
        boolean board[]=new boolean[4];
        int q=2;

        print(board,q,"",0,0);
    }

    private static void print(boolean[] board, int q, String s,int qplaced,int lp) {
        // base case
        if(qplaced==q){
            System.out.println(s);
            return;
        }


        for (int i = lp; i < board.length; i++) {
            if (board[i]!=true){
                board[i]=true;
                print(board,q,s+"B"+i+"Q"+qplaced,qplaced+1,i+1);
                board[i]=false;


            }

        }

    }
}
