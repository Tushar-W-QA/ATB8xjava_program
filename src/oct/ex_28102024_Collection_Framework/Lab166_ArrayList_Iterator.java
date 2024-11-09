package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab166_ArrayList_Iterator {
    public static void main(String[] args) {

        List myList = new ArrayList();
        myList.add("Tushar");
        myList.add("Pooja");
        myList.add("Deepak");
        System.out.println(myList);

        System.out.println("--------------ForLoop--------------");
        for (int i = 0; i < myList.size() ; i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("--------------ForEachLoop--------------");

        for (Object o : myList){
            System.out.println(o);
        }

        System.out.println("--------------Iterator--------------");

        Iterator<String> iterator = myList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
