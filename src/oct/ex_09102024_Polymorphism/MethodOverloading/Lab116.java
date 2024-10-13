package oct.ex_09102024_Polymorphism.MethodOverloading;

public class Lab116 {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        int number = m.add(4, 5);
        System.out.println(number);

        String full_name = m.add("Tushar", " Warad");
        System.out.println(full_name);
    }

}
