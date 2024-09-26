package sept.ex_20092024;

public class Lab045_maxMin_betwn3value_byUsingIfElseCondtion {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        int c = 40;
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
