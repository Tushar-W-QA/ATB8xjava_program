package oct.ex_23102024_Exception;

public class Lab144_exception_handle {
    public static void main(String[] args) {
        // To handle the exception we will use try and Catch method

        int a = 0;
        try {
            int b = 10/a;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            System.out.println("This final block always execute");
        }


    }
}
