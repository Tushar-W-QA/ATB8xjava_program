package Practice.forLoop;

import java.util.Scanner;

public class Inter_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long factorial = 1;

        for(int i=1; i<num; i++){
            factorial *= i;
        }
        System.out.println("Factor of "+ num +" is "+ factorial);
    }
}
