package Practice.forLoop;

import java.util.Scanner;

public class Inter2 {
    public static void main(String[] args) {
        //Write a Java program to reverse a given number using a for loop.

        int num = 2358;
        int reversed = 0;
        for (; num != 0; num /=10){
            int digit = num%10;
            reversed = reversed*10 + digit;
        }
        System.out.print(reversed);

    }
}
