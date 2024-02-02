package collegebacktracking;

public class arr2Dmanipulation {
    static int count=0;

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(pathprint(arr, 0, 0, ""));



    }

    private static int pathprint(int[][] arr, int row, int col, String s) {
        if (row == 2 && col == 2) {

            count++;

            return 1;

        }
        if (row<0 || col<0 || row == arr.length || col == arr[0].length) {
            return 0;
        }
        int a=0;
        if (arr[row][col] ==0){
            arr[row][col]=1;
            for (int i = 0; i < 9; i++) {
               a= pathprint(arr,row+1,col,s);

            }

            arr[row][col]=0;
        }
        return a;
    }
}
