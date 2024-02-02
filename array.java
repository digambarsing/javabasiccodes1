import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class array {


}
class arrays {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 24;
        arr[2] = 73;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//
//        }
//        int []num= {1,2,3,4,5};
//        System.out.println(Arrays.toString(num));
//
//
//        int []ar= new int[3];
//        Scanner sc = new Scanner(System.in);
//        for(int i=0;i<arr.length;i++){
//            ar[i]=sc.nextInt();


//        }
//        System.out.println(Arrays.toString(ar));
//
//        int [][]arrr = new int[2][2];
//        int [][]my = {{1,2},{3,4}};
//        System.out.println(my[0][0]);
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[2][2];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = sc.nextInt();
                System.out.println(ar[i][j]);


            }
            System.out.println(Arrays.toString(ar) );



        }
    }
}

