import java.util.Scanner;

public class jagged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows");
        int n= sc.nextInt();

        int [][]arr=new int[n][];


//        arr[0]=new int[3];
//        arr[1]=new int[2];
//        arr[2]=new int[6];
        for (int k=0;k< arr.length;k++)
            arr[k]=new int[k+1];

        int c=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(  arr[i][j] +" ");
            }
            System.out.println();
        }

    }

}
