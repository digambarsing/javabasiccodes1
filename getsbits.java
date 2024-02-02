package binarysys;

public class getsbits {
    public static void main(String[] args) {
        int n=3;
        int i=1;

        int b=1<<i;

        if((n&b)==0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    }

