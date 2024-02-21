package collegebacktracking;

public class chessboard {
    static int count=0;
    public static void main(String[] args) {
        int n=3;
        int[][]board=new int[n][n];
        print(board,0,0,"");
        System.out.println(count);

    }

    private static void print(int[][] board, int row, int col,String ans) {

        if (row >= board.length || col >= board[0].length){
            return;
        }

        if(row==board.length-1 && col== board[0].length-1){
            System.out.println(ans);
            count++;
            return;
        }


        //knight
        int[]r={2,1};
        int[]c={1,2};


        for (int i = 0; i < c.length; i++) {
            print(board,row+r[i],col+c[i],ans+i);

        }

        //rook

        if (row==0|| row==board.length-1 || col==0|| col== board[0].length-1){
            // for row

            for (int i = 1; i < board.length; i++) {
                print(board,row+i,col,ans+i);

            }

            // for col
            for (int i = 1; i < board[0].length ; i++) {
                print(board,row,col+i,ans+i);

            }

        }

        // bishoop

        if (row==col || row+col==board.length-1){
            for (int i = 1; i < board.length; i++) {
                print(board,row+i,col+i,ans+i);

            }

        }
    }
}
