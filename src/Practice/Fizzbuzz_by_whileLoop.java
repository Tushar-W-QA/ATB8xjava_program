package Practice;

public class Fizzbuzz_by_whileLoop {

    public static void main(String[] args) {
        // Fizzbuzz problem by while loop.
//        Write a program that prints numbers from 1 to 100. However,
//        for multiples of 3, print "Fizz" instead of the number, and
//        for multiples of 5, print "Buzz."
//        For numbers that are multiples of both 3 and 5, print "FizzBuzz."

//        int i = 1;
//        while (i <= 100){
//            if (i%3 == 0 && i%5 == 0){
//                System.out.println("FizzBuzz--> " + i);
//
//            } else if (i%3 == 0) {
//                System.out.println("Fizz--> " + i);
//
//            } else if (i%5 == 0) {
//                System.out.println("Buzz--> " + i);
//
//            } else {
//                System.out.println("nothing--> " + i);
//
//            }
//            i++;
//        }
        // Fizzbuzz problem by do while loop.

        int i = 1;
        do {
            if( i%5 ==0 && i%3 == 0){
                System.out.println("FizzBuzz--> "+i);
            } else if (i%5==0) {
                System.out.println("Buzz--> "+i);
            } else if(i%3==0){
                System.out.println("Fizz--> "+i);
            } else
                System.out.println("Nothing!!--> " + i);
            i++;
        } while (i <= 100);

    }
}
