package task;

public class Task_27092024 {
    public static void main(String[] args) {
//        //  Create a Java program that prints the first 5 even numbers using a do-while loop.
//        int count = 0;
//        int number = 2;
//        do {
//            System.out.println(number);
//            number += 2;
//            count++;
//        } while (count < 5);
//    }


        // Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

        int i = 1;
        int sum = 1;

//        do {
//            System.out.println("sum of numbers from 1 to 100 is --> " + sum);
//            sum += i;
//            i++;
//        } while (i <= 100);

        while (i <= 100){
            sum += i;
            i ++;
            System.out.println("Sum of number 0-100 is " + sum);
        }
    }
}
