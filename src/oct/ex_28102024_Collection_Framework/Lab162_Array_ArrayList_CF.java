package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;

public class Lab162_Array_ArrayList_CF {
    public static void main(String[] args) {
        // Collection --> Interface (10 function)
        // List --> Interface (15 ) total 25
        // List is further implemented by
            // 1. ArrayList
            // 2. LinkedList
            // 3. Stack
            // 4. Vector

        // Shopping - bread,milk, curd, panneer, buttermilk. , butter
        // Collection of items - with same or different data type.
        // Collections of students


        ArrayList studentList = new ArrayList();
        studentList.add("Tushar");
        studentList.add("Deepak");
        studentList.add("Tushar");
        studentList.add("Prashant");
        studentList.add("Tushar123");
        studentList.add(1245);
        studentList.add(false);
        studentList.add(null);

        System.out.println(studentList);
    }
}
