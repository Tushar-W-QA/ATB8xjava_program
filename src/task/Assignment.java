package task;

public class Assignment {
    public static void main(String[] args) {
        // 1. Difference between = and  ==?

        // '=' is used as assignment operator
        // '==' is used to Compared the two values.
        int a = 5;
        boolean x = (a == 10);
        System.out.println(x);

        // second example:

        String animal = "cat";
        String fruit = "banana";

        boolean is_apple_fruit = (fruit == "apple");
        boolean is_cat_animal = (animal == "cat");

        System.out.println(is_apple_fruit);
        System.out.println(is_cat_animal);
    //----------------------------------------------------------------//

    // 2. byte b = 10; long l = 10l; → How much Byte will be used
        // byte --> uses the 1 byte
        // long l --> uses the 8 bytes
        // So It will be use the 9 bytes total
    // ----------------------------------------------------------------//

    // 3. Another byte b = 10; byte c = 10;
    //    What is the anwser if the perform b+c, What is the data type it will give in result.

        byte b = 10;
        byte c = 10;

        System.out.println(b + c); // it will be the int data type.

    // 4.
        short s = 10;
        char n = 'A'; //65
        int ss = s+n;
        System.out.println(ss); // output will be the 75










    }
}
