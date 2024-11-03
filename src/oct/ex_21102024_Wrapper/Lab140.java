package oct.ex_21102024_Wrapper;

public class Lab140 {
    public static void main(String[] args) {
        try {
            int[] number = {1, 2, 3};
            System.out.println(number[27]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
