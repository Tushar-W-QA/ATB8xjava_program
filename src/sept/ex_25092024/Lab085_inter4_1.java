package sept.ex_25092024;

import java.util.Scanner;

public class Lab085_inter4_1 {
    public static void main(String[] args) {
        // Sum of Even Numbers:
        // Write a Java program to find the sum of all even numbers between 1 and n using a for loop.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i<n; i++){
            if(i%2 ==0){
                //compound assignment operator is used
                sum += i; // sum = sum+i
            }
        }
        System.out.println("sum of all even numbers between 1 and " + n + " is " + sum);

    }
}
