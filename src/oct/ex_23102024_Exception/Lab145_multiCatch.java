package oct.ex_23102024_Exception;

public class Lab145_multiCatch {
    public static void main(String[] args) {
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int b = Integer.parseInt(ip); // NumberFormatException
            int c = 100/b; // ArithmeticException
            System.out.println(c);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            // throw new RuntimeException(e);
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            // throw new RuntimeException(e);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            // throw new RuntimeException(e);
        } finally {
            System.out.println("End");
        }
    }
}
