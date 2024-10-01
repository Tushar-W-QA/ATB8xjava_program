package Practice;

import java.util.Scanner;

public class LeapYear2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeapYear = false;
//        if (year%4 ==0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    isLeapYear = true;
//                } else
//                    isLeapYear = false;
//            } else
//                isLeapYear = true;
//        } else
//            isLeapYear = false;
//
//        System.out.println( year + " is the leap year ? --> " + isLeapYear);


        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        } else
            isLeapYear = false;

        if(isLeapYear){
            System.out.println( year + " is the leap year.");
        } else
            System.out.println( year + " is not a leap year.");

    }
}
