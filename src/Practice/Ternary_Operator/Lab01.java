package Practice.Ternary_Operator;

public class Lab01 {

    public static void main(String[] args) {
        // Fizzbuzz problem by while loop.
//        Write a program that prints numbers from 1 to 100. However,
//        for multiples of 3, print "Fizz" instead of the number, and
//        for multiples of 5, print "Buzz."
//        For numbers that are multiples of both 3 and 5, print "FizzBuzz."

        for (int i = 1; i <= 100; i++) {
            String result = (i % 5 == 0 && i % 3 == 0 ?  i + "--> FizzBuzz" :
                    i % 5 == 0 ? i +"--> Buzz" :
                            i % 3 == 0 ? i +"--> Fizz" : i + "--> Nothing !!");
            System.out.println(result);
        }

    }
}
