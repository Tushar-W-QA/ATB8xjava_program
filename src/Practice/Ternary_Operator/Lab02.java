package Practice.Ternary_Operator;

public class Lab02 {

    public static void main(String[] args) {
        // Leap Year

        int year = 2024;

        String leapYear =  ( year%4 ==0 ? "Is the leap year" :
                year%100 == 0 ? "is not a leap year" :
                        year%400 == 0 ? "is the leap year" : "Invalid input");
        System.out.println(leapYear);
    }
}

