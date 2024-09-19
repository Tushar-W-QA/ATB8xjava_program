package sept.ex_18092024;

public class Lab027 {

    public static void main(String[] args) {
        // post Increment
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        // line no. | Exp           | a
        // 7        |               | 10
        // 8        | result = 10   | 10
        // 9        | result = 10   | 11
        // 10        | result = 10   | 11
    }


}
