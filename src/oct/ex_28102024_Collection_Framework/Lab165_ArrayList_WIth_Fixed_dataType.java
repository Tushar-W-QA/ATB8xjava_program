package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab165_ArrayList_WIth_Fixed_dataType {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList();
        l.add(125);
        l.add(879);
        // l.add("Tushar")  --> It doesn't allow because we fixed as "Integer <>" in father reference.

        System.out.println(l);

        System.out.println("----------------------------");

        List<String> l1 = new ArrayList();
        l1.add("Tushar");
        l1.add("Warad");
        // l1.add(9124) --> It doesn't allow because we fixed as "String <>" in father reference.
        System.out.println(l1);





    }
}
