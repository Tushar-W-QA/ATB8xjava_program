package sept.ex_25092024;

import java.util.Scanner;

public class Lab087_inter5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate the factorial: ");
        int number = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i<number; i++){
            factorial *= i;
        }
        System.out.println("Factor of "+ number +" is " + factorial);
    }
}
