package task;

import java.util.Scanner;

public class Task_leap_year2024 {
    // with scanner
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = false;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        System.out.println("Enter the year to be checked : ");
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else
                    isLeapYear = false;
            } else
                isLeapYear = true;

        } else
            isLeapYear = false;

        System.out.println(year + "is the leap? "+ isLeapYear);
    }

}