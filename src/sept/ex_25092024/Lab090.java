package sept.ex_25092024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        // Write a Java program to find the sum of all even numbers between 1 and n using a while loop.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int num = sc.nextInt();
        int sum = 0;

        int i =1;
        while(i<num){
            sum += i;
            i++;
        }
        System.out.println("sum of all even numbers between 1 and " + num + " is " + sum);
    }
}
