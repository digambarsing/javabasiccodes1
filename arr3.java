package self;

import java.util.Arrays;

public class arr3 {

    static void sum(int[]arr,int target){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.println("("+arr[i]+" "+arr[j]+")");
                }

            }

        }
    }




    static void tripletsum(int[]arr,int target){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==target){
                        System.out.println("("+arr[i]+" "+arr[j]+" "+arr[k]+")");
                    }

                }

            }

        }
    }





    static void findunique(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    arr[i]=arr[j]=-1;
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=-1){
                System.out.println(arr[i]);
            }

        }

    }






    static int largest(int[]arr){

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];

            }

        }

        return max;
    }


    static void secondlargest(int[]arr){
        int max=largest(arr);

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }

        }
        System.out.println("second largest element in array is "+largest(arr));
    }





    static void repeatfirstele(int[]ar){
        for (int i = 0; i <ar.length ; i++) {
            for (int j = i+1; j <ar.length ; j++) {
                if (ar[i]==ar[j]){
                    System.out.println(ar[i]);
                    return;
                }

            }

        }
    }


    public static void main(String[] args) {
        int arr[]={4,6,3,5,8,2};

        int []arrr={1,4,5,6,3};
        int target=7;

        int target1=12;

        int []br={1,2,3,4,3,2,1};

        int[]cr={46,75,32,67,89,46,75,32,67};



      //  sum(arr,target);

      //  tripletsum(arrr,target1);

      // findunique(cr);


      //  System.out.println("first largest element in array is "+largest(arr));

     //   secondlargest(arr);


        int[]f={2,3,4,5,6,7,5,7};
        repeatfirstele(f);
    }
}
