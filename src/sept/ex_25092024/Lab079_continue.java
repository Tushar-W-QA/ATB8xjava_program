package sept.ex_25092024;

public class Lab079_continue {
    public static void main(String[] args) {
        // continue keyword: do nothing and go to the next iteration cycle (Skip It)
        for(int i=1; i<=5; i++){
            System.out.println(i);
            if(i == 3) {
                continue;
            }
            System.out.println("AFter");

        }
    }
}
