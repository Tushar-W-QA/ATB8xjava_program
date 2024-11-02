package oct.ex_18102024_String;

public class Lab133_StringBuffer_StringBuilder {
    public static void main(String[] args) {
        // Normal final string class which are immutable in nature
        // immutable if we assign the change the value it will not impact to the original string value
//        String name ="Tushar";
//        name = "warad";

        StringBuffer sb = new StringBuffer("Tushar");
        sb.append(" Warad");
        System.out.println(sb);
    }
}
