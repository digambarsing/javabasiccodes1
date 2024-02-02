import org.w3c.dom.ls.LSOutput;
import pw.skills.*;

public class outside{


    public static void main(String[] args) {
        pwskills obj = new pwskills();
        System.out.println(obj.str);
        app3 obj3 = new app3();
        obj3.fro();
    }

}
//  cild class of parent class pwskills
class app3 extends pwskills{
    void fro(){
        app3 obj3 = new app3();
        System.out.println(obj3.str);
    }




}
