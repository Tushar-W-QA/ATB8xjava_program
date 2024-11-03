package oct.ex_21102024_Wrapper;

public class Lab138 {
    public static void main(String[] args) {
        int c = 10;

        try {
            c = c/0;
            System.out.println(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
