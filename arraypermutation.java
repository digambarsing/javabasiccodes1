package collegedsa;

import java.util.ArrayList;

public class arraypermutation {


    static void print(int[]arr,ArrayList<Integer> list){
        if (list.size()==3){
            System.out.println(list);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==42){
                continue;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            int k=arr[i];
            arr[i]='*';
            print(arr,list);
            arr[i]=k;
            list.remove(list.size()-1);

        }
    }
    public static void main(String[] args) {
        int []array={1,2,3};

        ArrayList<Integer> list=new ArrayList<>();

        print(array,list);

    }
}
