package task;

import java.util.Scanner;

public class Task_Lap_year_2024_scanner {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = true;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        } else
            isLeapYear = false;

        if (isLeapYear) {
            System.out.println(year + " is the leap year");
        } else
            System.out.println(year + " is not a leap year");
    }
}
