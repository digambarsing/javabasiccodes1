package searchalggo;

public class rotatedarrbinminele {
    // find minimum ele in rotated array

    static int minele(int[]arr){
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){


            int mid=start+(end-start)/2;



            if(arr[mid]<=arr[arr.length-1]){
                ans=mid;
                end=mid-1;

            }
            else  {
                start=mid+1;

            }
        }
     return ans;

    }
    public static void main(String[] args) {

        int []arr={5,6,7,8,9,1,2,3,4};
        System.out.println(minele(arr));

    }
}
