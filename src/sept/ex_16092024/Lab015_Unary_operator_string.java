package sept.ex_16092024;

public class Lab015_Unary_operator_string {
    public static void main(String[] args) {
        // Unary Operator : single operator used
        // if used + --> int - it will add/ will do the sumation
        // if used + --> String - it will combine/concat it

        String first_name = "Tushar";
        String last_name = "Warad";
        int a = 10; // + --> unary operator
        int b = - 10;  // - --> unary operator

        //System.out.println(first_name + last_name);
        //System.out.println(a);
        //System.out.println(b);
        System.out.println(first_name + last_name+a+b);
        // whenever 1 string after that '+' function will work as concatenation for rest of all

        System.out.println(a+b+first_name + last_name);
        // whenever 1 integer then '+' function will work as addition and
        // after string + function will do concatenation for rest of all

    }
}
