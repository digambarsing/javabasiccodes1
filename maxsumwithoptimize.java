package sigma;

public class maxsumwithoptimize {
    static void maxsumarr(int[]arr){
        // time complexity is o(n**3)

        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        int[]prefixarray=new int[arr.length];
        prefixarray[0]=arr[0];
        for (int i = 1; i < prefixarray.length; i++) {
            prefixarray[i]=prefixarray[i-1]+arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                currentsum=0;

                currentsum= i==0? prefixarray[j] :prefixarray[j]-prefixarray[i-1];

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
