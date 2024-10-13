package Practice.whileLoop;

public class Lab002 {
    public static void main(String[] args) {
        // Write a Java program to print the multiplication table of a given number using a while loop.

//        int num = 15;
//        int i = 1;
//        while ( i <= 10) {
//            System.out.println( num + " * " + i + " = " + (num*i));
//            i++;
//        }

        // do while

        int num = 11;
        int i = 1;
        do{
            System.out.println( num + " * " + i + " = " + (num * i));
            i++;
        } while (i <= 10);

    }
}
