package oct.ex_23102024_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab151_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        extracted();
    }

    private static void extracted() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("tushar.txt");
    }
}
