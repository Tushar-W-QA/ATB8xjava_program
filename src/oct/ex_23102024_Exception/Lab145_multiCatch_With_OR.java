package oct.ex_23102024_Exception;

public class Lab145_multiCatch_With_OR {
    public static void main(String[] args) {
        try {
            String ip = args[1]; // java.lang.ArrayIndexOutOfBoundsException
            int b = Integer.parseInt(ip); // NumberFormatException
            int c = 100/b; // ArithmeticException
            System.out.println(c);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
            // throw new RuntimeException(e);
        }
        finally {
            System.out.println("End");
        }
    }
}
