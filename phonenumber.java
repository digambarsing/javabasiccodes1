package collegedsa;

import java.util.ArrayList;

public class phonenumber {
    static void print(String digits,String[]arr,String ans,ArrayList<String>list){



        if(digits.length()==0){
            list.add(ans);


          //  System.out.println(ans);


            return;
        }


        char ch=digits.charAt(0);
        int k=ch-48;
        String ques=arr[k-1];

        for (int i = 0; i <ques.length() ; i++) {
            print(digits.substring(1),arr,ans+ques.charAt(i),list);

        }

    }
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        String digits="23";
        String[]arr={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        print(digits,arr,"",list);
        System.out.println(list);
    }
}
