package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab164_ArrayList {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(65);
        marks.add(68);
        marks.add(96);
        marks.add(84);
        marks.add(71);
        //System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);

//        Collections.sort(marks,Collections.reverseOrder());
//        System.out.println(marks);

       Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
    }
}
