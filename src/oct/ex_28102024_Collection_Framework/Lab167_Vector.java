package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab167_Vector {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Tushar");
        l.add("Deepak");
        l.add("Kavita");
        l.add("Santosh");
        l.add("Nilam");
        System.out.println(l);

        Vector v = new Vector();
        v.add("Prashant");
        v.add("Akash");
        System.out.println(v);
        System.out.println(v.isEmpty());
        System.out.println(v.contains("Akash"));

        // Only Problem with the Vector
        // - It is Thread Safe, Synchronised. --> That's why we will not use it
        // It will be time consumming
        // One by One - usage
        // Slower


    }
}
