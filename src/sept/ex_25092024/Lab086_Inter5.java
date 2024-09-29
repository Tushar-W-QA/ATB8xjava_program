package sept.ex_25092024;


public class Lab086_Inter5 {
    public static void main(String[] args) {
        // Factorial Calculation:
        // Write a Java program to calculate the factorial of a given number using a for loop.
        // Factorial *= i

        // 1. I/p = 10;
        //    Factorial *=i

        int n =10;
        long factorial = 1;
        for(int i = 1;  i<n; i++){
            factorial *= i;
        }
       // System.out.printf("Factorial of %d = %d", n, factorial);
        System.out.println("Factorial of "+ n + " is "+ factorial);




    }
}

