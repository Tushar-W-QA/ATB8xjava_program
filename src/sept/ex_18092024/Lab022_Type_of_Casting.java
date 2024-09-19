package sept.ex_18092024;

public class Lab022_Type_of_Casting {
    public static void main(String[] args) {
        // Type of casting
        // It has two types
        // 1. Widening --> Implicit, Explicit --> lossless
        // 2. Narrowing --> Implicit, Explicit (With dataType) loss

        //1. Widening
        // It means we are putting the data from smaller basket into bigger basket.
        byte b = 20;
        int a = b; // implicit casting
        int a1 = (int)b; // explicit casting

        //v2. Narrowing
        // It means we are putting the data from bigger basket into smaller basket.

        int narrow = 20;
        //byte x = narrow; // invalid implicit casting
        byte x1 = (byte) narrow; // valid explicit casting --> jvm --> it will loss the data.



    }
}
