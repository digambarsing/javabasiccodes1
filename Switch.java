package control_statements;

public class Switch {
    public static void main(String[] args) {
        int num=0;
        switch (num){
            case 0:
                System.out.println("0");
                break;

            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println(num);

        }

        String name="Ram";
        switch (name){
            case "Dev":
                System.out.println("Dev");
                break;

            case "Rams":
                System.out.println("r:");
                break;


            default:
                System.out.println(name);

        }
    }
}
