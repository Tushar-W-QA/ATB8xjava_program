package sept.ex_25092024;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {
        // print the odd and even number between 1 - 50 by using for loop

//        for (int i =1; i <=50; i++){
//            if(i%2 == 0){
//                System.out.println("Even--> " + i);
//                continue;
//            }
//            System.out.println(i);
//        }


        Scanner sc = new Scanner(System.in);
        int y = 1;
        y = sc.nextInt();
        if (y % 2 == 0) {
            System.out.println("Even --> " + y);
        } else {
            System.out.println("Odd --> " + y);
        }

    }
}

