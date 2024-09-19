package sept.ex_18092024;

public class Lab023_2practical_example_of_casting {

    public static void main(String[] args) {
        // GST =18.45;
        int course = 100;
        float fees = 18.45f;

        //int total_fees = fees + course; // narrowing --> implicit --> jvm will not allow --> invalid
        // float total_fees = fees + course; // widening --> implicit --> jvm will allow --> valid

        int total_fees = (int)fees + course; // narrowing --> explicit --> we will do forcefully --> we will lose the data.
        // if we are doing explicit in narrowing then we will lose the data.

        System.out.println(total_fees);
    }

}
