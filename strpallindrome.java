package stringbuilder_basic;

public class strpallindrome {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("abcd");

      StringBuilder  gtr=str.reverse();
      if(gtr==str){
          System.out.println("pallindrome");
      }
      else{
          System.out.println("not pallindrome");
      }
    }
}
