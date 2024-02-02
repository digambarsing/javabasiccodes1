package collegedsa;

public class occurenceofnumber {

    static int search(int[]arr,int val,int idx){
        if(arr[idx]==val){
            return idx;
        }
        return search(arr,val,idx+1);
    }
    static void searchs(int[]arr,int val,int idx){
        if(arr[idx]==val){
            System.out.println(idx);
        }
        System.out.println(search(arr,val,idx+1));

    }
    public static void main(String[] args) {
        int []arr={1,2,31,4,5,3,2,1,3,3,3};
      //  System.out.println(search(arr,3,0));
        searchs(arr,3,0);

    }
}
