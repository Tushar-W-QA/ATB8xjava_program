package oct.ex_23102024_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab148_Checked_Unchecked_Example {
    public static void main(String[] args) {
        // Uncheck example

        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is an example of unchecked");
        }

        System.out.println(" --------------------------------------- ");

        // Uncheck example
        try {
            FileReader f = new FileReader(new File("c://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is an example of Checked");
        }

    }
}
