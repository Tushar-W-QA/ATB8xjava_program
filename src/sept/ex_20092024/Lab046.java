package sept.ex_20092024;

public class Lab046 {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        int c = 40;

        int max_ab = (a < b) ? b : a;
        int max_ac = (a < c) ? c : a;

        int max_abc = max_ab < max_ac ? max_ac : max_ab;
        System.out.println(max_abc);
    }
}
