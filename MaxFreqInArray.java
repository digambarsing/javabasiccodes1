package HashMap;

import java.util.HashMap;

public class MaxFreqInArray {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,3,3,2,1,2,3,2,5,5,4,3,6,5,4};
        HashMap<Integer,Integer>map=new HashMap<>();

        for (int ele:arr) {
            if (!map.containsKey(ele)){
                map.put(ele, 1);
            }else{
                map.put(ele, map.get(ele)+1);
            }

        }

        System.out.println(map);

        int maxFreq=0;
        int ansKey=-1;
        int count=0;

        for (var e:map.entrySet()) {
            if (e.getValue()>maxFreq){
                maxFreq=e.getValue();
                ansKey=e.getKey();
            }
        }
        System.out.println(ansKey);


        for(int i: map.values()){
            if (maxFreq==i){
                count+=i;
            }
        }
        System.out.println(count);

    }
}
