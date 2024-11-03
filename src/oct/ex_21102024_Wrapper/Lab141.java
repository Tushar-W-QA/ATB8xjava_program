package oct.ex_21102024_Wrapper;

public class Lab141 {
    public static void main(String[] args) {
        try {
            int a = 10 / 1;
            String name = null;
            System.out.println(name.length());
        } catch (ArithmeticException e) {
            System.out.println("Error for arth: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error for Null: " + e.getMessage());
        }
    }
}
