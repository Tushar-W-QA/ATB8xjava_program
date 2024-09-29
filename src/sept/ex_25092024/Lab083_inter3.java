package sept.ex_25092024;

public class Lab083_inter3 {
    public static void main(String[] args) {
        // Write a Java program to print all natural numbers (reverse number) from 50 to 1 using a for loop.
        // find even and odd no. from 20 to 1

        for (int i = 20; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println("Even--> " + i);
            } else {
                System.out.println("Odd " + i);
            }
        }
    }
}
