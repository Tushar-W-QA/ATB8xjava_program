package Practice.forLoop;

import java.util.Scanner;

public class Inter003 {
    public static void main(String[] args) {
        // Write a Java program to print the multiplication table of a given number using a for loop.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for (int i =1; i<=10; i++){
            System.out.println( num +" X "+ i +" = "+ num*i);
        }
    }
}
