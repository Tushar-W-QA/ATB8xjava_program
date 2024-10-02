package sept.ex_30092024;

public class Lab109 {
    public static void main(String[] args) {
        // 1. Without parameter and without Return Type
        function_type_1();

        // 2. Without parameter but with Return Type
        String firstName = function_type_2();
        System.out.println(firstName);

        // 3. With parameters and without Return Type
        function_type_3("Tushar");

        // 4. With parameters and with Return Type
        int marks = function_type_4(4, 6);
        System.out.println(marks);





    }
// Define:
    // 1. Without parameter and without Return Type
    public static void function_type_1() {
        System.out.println("Friday Market");
    }

    // 2. Without parameter but with Return Type
    public static String function_type_2() {
        System.out.println("with Return Type and without Arguments");
        return "tushar";
    }

    // 3. With parameters and without Return Type
    public static void function_type_3(String name) {
        System.out.println("With parameters and without Return Type");
        System.out.println(" My FirstName is--> " + name);
    }

    // 4. With parameters and with Return Type
    public static int function_type_4 (int a, int b) {
        System.out.println("With parameters and with Return Type");
        return a+b;
    }

}