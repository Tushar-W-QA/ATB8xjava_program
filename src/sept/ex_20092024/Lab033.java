package sept.ex_20092024;

public class Lab033 {
    public static void main(String[] args) {
        // Evaluate the value of n if p = 5 and q = 19
        int p = 5;
        int q = 19;
        int n = (p - q) > (q - p) ? (p - q) : (q - p);
        System.out.println(n);
    }

}
