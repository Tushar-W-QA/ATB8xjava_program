package sept.ex_20092024;

public class Lab058 {
    public static void main(String[] args) {
        // JDK > 13
        // multiple cases

        long num = 006;
        switch ( (int) num) {
            case 001, 003, 005:
                System.out.println("Associated with Civil branch");
                break;
            case 002, 004,006:
                System.out.println("Associated with Mechanical Branch");
                break;
            default:
                System.out.println("none");
                break;
        }
    }
}
