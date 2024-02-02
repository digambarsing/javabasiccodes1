package searchalggo;

public class prob1 {
    // first occurence of a number
    public static void main(String[] args) {
        int []arr={1,2,3,3,4,5,5,5,6,6,7,8,9,9};

        int target=6;

        for (int i = 0; i <arr.length ; i++) {
            int st=0;
            int en= arr.length-1;



            while (st<=en){
                int mid=st+(en-st)/2;

                if (arr[mid]==target){
                    System.out.println(mid);
                    return;
                } else if (arr[mid]>target) {
                    en=mid-1;

                }else{
                    st=mid+1;
                }
            }

        }
    }
}
