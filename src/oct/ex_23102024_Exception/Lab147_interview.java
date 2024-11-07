package oct.ex_23102024_Exception;

public class Lab147_interview {
    public static void main(String[] args) {
        final double pi = 3.14;
        try {
            int a = 0;
            int b = 10/a;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final will always execute");
        }
    }
}
