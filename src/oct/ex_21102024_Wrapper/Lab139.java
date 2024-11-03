package oct.ex_21102024_Wrapper;

public class Lab139 {

    public static void main(String[] args) {

        try {
            String s = "t";
            System.out.println(s.trim());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
