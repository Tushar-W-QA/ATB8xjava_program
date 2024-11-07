package oct.ex_23102024_Exception;

public class Lab146_Interview {
    public static void main(String[] args) {

        try {
            String s1 = "Tushar";
            // String a1 = args[0]; // not given argument through edit config.
            // int a = 10/0;
            s1 = null;
            System.out.println(s1.length());
        } catch (Exception e) {
            System.out.println("This code will execute");
            System.out.println(e.getMessage());
        }

        System.out.println("End Program");


    }
}
