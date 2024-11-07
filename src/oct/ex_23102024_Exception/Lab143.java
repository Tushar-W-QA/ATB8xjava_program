package oct.ex_23102024_Exception;

public class Lab143 {
    public static void main(String[] args) {
        // exception is an **event that occurs during the execution**
        // of a program that **disrupts the normal flow of instructions.  (Can be handled)**

        // There are two types of exception:
        // 1. Checked - JVM knows about it Checked
        // 2. UnChecked - JVM doesn't know about it. - UnChecked. (Runtime exceptions)

        int a = 0;
        int b = 10/a;
        System.out.println(b);
    }
}
