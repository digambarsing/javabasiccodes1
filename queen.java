package collegebacktracking;

public class queen {
    public static void main(String[] args) {
        boolean board[]=new boolean[4];
        int q=2;

        print(board,q,"",0);
    }

    private static void print(boolean[] board, int q, String s,int qplaced) {
        // base case
        if(qplaced==q){
            System.out.println(s);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i]!=true){
                board[i]=true; // it is used to track or chane condition.
                print(board,q,s+"B"+i+"Q"+qplaced,qplaced+1);
                board[i]=false; // it is call backtrack. it is convert it into start position.

            }

        }

    }
}
