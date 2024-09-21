package sept.ex_20092024;

public class Lab029_Ternary_operator {
    public static void main(String[] args) {
        /* Ternary Operator:
        The ternary operator in Java is a shorthand way to write an if-else statement.
        It’s called the ternary operator because it takes three operands

        Syntax:
         condition ? expression_if_true : expression_if_false

         expression_if_true: The value returned if the condition is true.
         expression_if_false: The value returned if the condition is false
         */

        String a = (40 < 80) ? "XX" : "YY";
        System.out.println(a);

    }
}
