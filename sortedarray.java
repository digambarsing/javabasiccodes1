package collegedsa;

public class sortedarray {
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,56,78};
        System.out.println(isorted(array,0));
    }

    private static boolean isorted(int[] array, int i) {
        if(i== array.length-1){
            return true;
        }
        if (array[i]>array[i+1]){
            return false;
        }
       return isorted(array,i+1);
    }
}
