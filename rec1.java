package collegedsa;

public class rec1 {
    // search method
    static int search(int[]arr,int value,int index){
        if(arr[index]==value){
            return index;
        }
        return search(arr,3,index+1);

    }
    static int fact( int n){
        if(n==0){
            return 1;
        }
        int sp=fact(n-1);
        int ans=n*sp;// return n*fact(n-1);
        return ans;

    }
    public static void main(String[] args) {
//        pmi (principal mathmatic induction)
//                step 1: check formula for small value is correct or not // call it base case

//                step 2: suppose your formula is correct
//                step 3: proof formula is correct

      //  base case is a stop condition

        int []arr={1,2,3,4,3,2,1,5,6};
        int val=3;
      int x=  search(arr,3,0);
        System.out.println(x);
        //System.out.println(fact(6));
    }
}
