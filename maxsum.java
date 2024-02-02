package sigma;

public class maxsum {

    static void maxsumarr(int[]arr){
        // time complexity is o(n**3)

        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                currentsum=0;
                for (int k = i; k <=j ; k++) {
                    currentsum+=arr[k];


                }
                if(maxsum<currentsum){
                    maxsum=currentsum;

                }

            }

        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {

        int []arr={2,4,6,8,10};

        maxsumarr(arr);

    }
}
