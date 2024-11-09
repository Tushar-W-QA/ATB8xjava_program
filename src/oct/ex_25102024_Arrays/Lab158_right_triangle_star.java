package oct.ex_25102024_Arrays;

import java.util.Scanner;

public class Lab158_right_triangle_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println("Enter the numnber: ");


        for (int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
