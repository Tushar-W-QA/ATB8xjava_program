package task;

public class Task_23092024 {
    public static void main(String[] args) {
//         // Create a simple calculator that performs addition, subtraction, multiplication, and division, modulus
//         // based on user input using switch statements
//            public static void main(String[] args) {
//                    int num1 = 60;
//                    int num2 = 40;
//                    int operator = '-';
//                    int result = num1 + num2;
//
//                    switch (operator){
//                        case '+':
//                            System.out.println(num1 + num2);
//                            break;
//                        case '-':
//                            System.out.println(num1 - num2);
//                            break;
//                        case '/':
//                            System.out.println(num1 / num2);
//                            break;
//                        case '*':
//                            System.out.println(num1 * num2);
//                            break;
//                        case '%':
//                            System.out.println(num1 % num2);
//                            break;
//                    }
//            }
// ------------------------------<><><<><<><><><><><>---------------------------------------------------//

// Write a program that takes an integer input (1-12) and prints the name of the corresponding month
// using a switch statement.
//Input  - 12
//Out - Dec.
//
//        int month = 8;
//        switch (month) {
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("september");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//        }

// Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit)
// based on user selection using a switch statement.
// Input. -
// choice - 1 - km → m, km → 1km
// choice - 2 - f → c, f → c

        int choice = 2;
        int value = 32;

        switch (choice){
            case 1:
                double miles = (0.621371 * value);
                // System.out.println(miles);
                System.out.println(value + " Kilometer value is converted into " + miles +" Miles");
                break;

            case 2:
                double fahrenheit = (value * 9/5) + 32;
                // System.out.println(fahrenheit);
                System.out.println( value + " Celsius value is converted into "+ fahrenheit + " fahrenheit");
                break;
        }
    }
}



