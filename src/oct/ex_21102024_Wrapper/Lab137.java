package oct.ex_21102024_Wrapper;

import java.io.FileInputStream;

public class Lab137 {
    public static void main(String[] args) {

        //CHecked- JVM knows
       // FileInputStream ip = new FileInputStream("C://a.text");

        //Unchecked- JVM does not know
        int a = 20;
        int b = a/0;
        System.out.println(b);
        // It will know during the execution
    }
}
