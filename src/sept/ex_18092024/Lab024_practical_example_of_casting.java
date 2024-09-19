package sept.ex_18092024;

public class Lab024_practical_example_of_casting {

    public static void main(String[] args) {
        long mobile_no = 98974658755l;
        // short simCard = mobile_no; // narrowing --> implicit --> jvm will not allow the implicit

        short simCard = (short) mobile_no; // explicit  --> jvm will allow explicit, but it will lose the data.


    }

}
