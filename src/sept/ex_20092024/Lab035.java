package sept.ex_20092024;

public class Lab035 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3;
        int max_btween_ab = a < b ? b : a;
        // System.out.println(max_btween_ab); // 10

        int max_between_ac = a < c ? c : a;
        //System.out.println(max_between_ac);  // 5

        int max_between_abc = max_btween_ab > max_between_ac ? max_btween_ab : max_between_ac;
        System.out.println(max_between_abc);

    }
}
