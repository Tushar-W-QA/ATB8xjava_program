package oct.ex_25102024_Arrays;

public class Lab159_left_triangle_star {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}