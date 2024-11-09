package oct.ex_25102024_Arrays;

import java.util.Arrays;

public class Lab152_Arrays {
    public static void main(String[] args) {
//        Array is a collection of data which is of similar data type.
//        Array is also called as Homogeneous data structure. ( int)
//        Arrays are objects in Java. // bcoz they have their own attribute and behaviour
//        Elements of an array will be stored in **contiguous memory locations.**
//        Arrays can be constructed with multiple dimensions i.e 1-D Array, 2-D Array etc.

        // How to iterate the array?
        // --> By using the for loop we can iterate the array.

// 10th marksSheet

        int [] marks = {63, 55, 78, 94, 65};
        // arrays indexes start from " 0 to (length-1) "
        System.out.println(marks[1]);
        System.out.println(marks[3]);
        System.out.println(marks[2]);
        // System.out.println(marks[6]); // error: ArrayIndexOutOfBoundsException

        System.out.println("-------------------");
        Arrays.sort(marks);
        System.out.println(" Ascending---> " + Arrays.toString(marks));


        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }



        int[] marks2 =  new int[5];
        marks2[0] = 55;
        marks2[1] = 64;
        marks2[2] = 95;

        //System.out.println(marks2[1]);

    }
}
