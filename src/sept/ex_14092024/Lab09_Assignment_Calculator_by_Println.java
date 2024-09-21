package sept.ex_14092024;

public class Lab09_Assignment_Calculator_by_Println {

    public static void main(String[] args) {
        double a = 34;
        double b = 10;

        double sumation = a + b;
        System.out.printf("%f + %f = %f", a, b, sumation);
        System.out.println();

        double subtraction = a - b;
        System.out.printf("%f - %f = %f", a, b, subtraction);
        System.out.println();

        double multiplication = a * b;
        System.out.printf("%f * %f = %f", a, b, multiplication);
        System.out.println();

        double division = a / b;
        System.out.printf("%f / %f = %f", a, b, division);
        System.out.println();

        double modulus = a % b;
        System.out.printf("%f %% %f = %f", a, b, modulus);
        System.out.println();

    }
}
