package Practice.whileLoop;

public class Lab01 {
    // //Write a Java program to reverse a given number using a while loop.
    public static void main(String[] args) {
        int num = 6958;
        int resversed = 0;
        while (num != 0) {
            int digit = num%10;
            resversed = resversed*10 + digit;
            num /= 10;
        }
        System.out.println(resversed);

        // //Write a Java program to reverse a given number using a  do while loop.

//        int num1 = 69867;
//        int reversed = 0;
//        do {
//
//            int digit = num1%10;
//            reversed = reversed*10 + digit;
//            num1 /=10;
//        }while (num1 != 0);
//        System.out.println(reversed);
    }
}
