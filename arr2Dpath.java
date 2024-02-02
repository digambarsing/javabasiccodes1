package collegedsa;

public class arr2Dpath {
    static int count = 0;

    static int path(int arr[][], int row, int col, String ans) {
        if (row == 2 && col == 2) {
            System.out.println(ans);
            count++;
            return 1;
        }
//        if (col==arr[0].length || row == arr.length){
//            return;
//        }

        int a = 0, b = 0;
        if (col < arr[0].length)
            a = path(arr, row, col + 1, ans + 'H');
        if (row < arr.length)
            b = path(arr, row + 1, col, ans + 'V');

        return a+b;
    }

    public static void main(String[] args) {
        int[][]arr=new int[3][3];
        System.out.println(path(arr,0,0,""));
        System.out.println(count);

    }
}

