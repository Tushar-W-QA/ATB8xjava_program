package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab163_List_Parent {
    public static void main(String[] args) {
        // List is interface
        // List list = new List(); Not possible to create an object of interfact
        List fruitList = List.of("Banana", "Apple", "Mango", "Chiku");

        // How we are able to create a list? --->
        // due to the "of" function ---> "of" is static function in interface.That contains the full definition.
        System.out.println(fruitList);
        System.out.println(fruitList.size());


        System.out.println("---------------------------------------------");
        fruitList.add("Orange"); // --> it will give a error like a "UnsupportedOperationException"
        // Can we add a new fruit in the fruitList
    // Ans --> No
        // add function is not available in list, it is abstract (incomplete) method.
        // that's why it will not allow you to add a new fruit.


        System.out.println("---------------------------------------------");

        // If we want to add a new fruit in the list then
        // Who will add (REAL IMPLEMENTATION) a new fruit in a list ??
    // Ans --> CHILD will add (REAL IMPLEMENTATION) a new fruit in a list

        // -------------------------------------------------------

        // How Child will do the real implementation??
    // Ans --> By doing the Dynamic Dispatch
           //  By doing father reference and Child object


        System.out.println("---------------------------------------------");
        List l = new ArrayList();
        // by doing father reference and Child object
        // List l --> father reference
        // new ArrayList() --> Child object

        













    }
}
