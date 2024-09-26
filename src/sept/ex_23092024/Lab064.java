package sept.ex_23092024;

public class Lab064 {

    // Create a simple calculator that performs addition, subtraction, multiplication, and division, modulus
    // based on user input using switch statements
    public static void main(String[] args) {
            int num1 = 60;
            int num2 = 40;
            int operator = '-';
            int result = num1 + num2;

            switch (operator){
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '%':
                    System.out.println(num1 % num2);
                    break;
            }
    }
}
