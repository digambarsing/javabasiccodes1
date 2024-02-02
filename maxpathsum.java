package collegedsa;

public class maxpathsum {
    public static int max;

    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        pathsum(arr,0,0,0);
        System.out.println(max);

    }

    private static void pathsum(int[][] arr, int row, int col, int ans) {
        if (row == 2 && col == 2) {
            ans=ans+arr[arr.length-1][arr[0].length-1];
            max=Math.max(ans,max);


            return;
        }

        if (col < arr[0].length-1)
             pathsum(arr, row, col + 1, ans + arr[row][col]);
        if (row < arr.length-1)
             pathsum(arr, row + 1, col, ans + arr[row][col]);



    }
}
