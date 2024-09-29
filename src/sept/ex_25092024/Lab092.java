package sept.ex_25092024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        // how to take user the User's Input

        Scanner sc = new Scanner(System.in); // new operator is used to create a new object.
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.print("Enter a name: ");
        String name = sc.next();
        System.out.println(name);

    }
}
