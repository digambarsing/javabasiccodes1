package control_statements;

public class descision {
    // Descision statements




    public static void main(String[] args) {

        // if statement
        int a=10;
        if(a>5)
            System.out.println("good");

        int x=10;
        int y=19;
        if(x+y>20){
            //System.out.println("x+y is greater than 20");
        }

        // if-else

        if(y<x){
            //System.out.println("smaller");
        }else{
            //System.out.println("greater");
        }

        // if else-if
        String city="Agra";
        if( city == "Delhi" ){
           // System.out.println("Delhi");
        } else if (city=="Mathura") {
          //  System.out.println("mathura");

        }else{
            //System.out.println(city);
        }

        int q=5;
        int w=47;
        int e=56;int r=89;
        if(q>w){
            if(q<e){
                System.out.println(q);
            } else if (q>r) {
                System.out.println(r);

            }else{
                System.out.println("none");
            }
        }else{
            if(w>e) System.out.println(w);
            else System.out.println(e);
        }

        // main
        //public class LeapYearExample {
           // public static void main(String[] args) {
                int year=2020;
                if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
                    System.out.println("LEAP YEAR");
                }
                else{
                    System.out.println("COMMON YEAR");
                }
            }
        }

