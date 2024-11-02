package oct.ex_18102024_String;

public class Lab130_stringEqual {
    public static void main(String[] args) {
        String s1 = "Tiger"; // scp --> String Constant Pool
        String s5 = "Tiger";// scp
        String s2 =  new String("Tushar"); // object area
        String s3 =  new String("Tushar");
        String s6 =  new String("tushar");


        System.out.println(s1 == s2); // false, the location s1 and s2 are different
        System.out.println(s2 == s3); // false, the location s2 and s3 are different

        // == This checking the reference location

        System.out.println(s1.equals(s5));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s6));
        System.out.println(s2.equalsIgnoreCase(s6));

    }


}
