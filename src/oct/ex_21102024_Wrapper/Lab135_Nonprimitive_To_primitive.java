package oct.ex_21102024_Wrapper;

public class Lab135_Nonprimitive_To_primitive {

    public static void main(String[] args) {
        // Conversion from Non-primitive to primitive

        String num = "10";
      //  int a = num; --> this does not support

        Integer num1 = Integer.valueOf(num);
        System.out.println(num1);

        int a = num1;
        System.out.println(a);


        // Conversion from primitive to Non-primitive

        int a2 = Integer.parseInt(num);


    }
}
