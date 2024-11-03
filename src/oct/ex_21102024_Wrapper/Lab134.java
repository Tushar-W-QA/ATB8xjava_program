package oct.ex_21102024_Wrapper;

public class Lab134 {
    public static void main(String[] args) {
        int a = 10;


        int b = 20;
        Integer c = b; // --> boxing process --> int to integer
        System.out.println(c);

        Integer x = 50;
        int y = x; // Unboxing process --> Integer to int
        System.out.println(y);
    }
}
