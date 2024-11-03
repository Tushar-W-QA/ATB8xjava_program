package oct.ex_21102024_Wrapper;

public class Lab142 {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch ( NullPointerException e){
            //throw new RuntimeException();
            System.out.println("Error for Null: " + e.getMessage());
        }

    }
}
