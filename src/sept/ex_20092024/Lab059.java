package sept.ex_20092024;

public class Lab059 {
    public static void main(String[] args) {
        // without break keyword
        // case: we can give multiple statements
        // case -> we can give only single statement

//        int num = 001;
//        switch (num){
//            case 001:
//                System.out.println("Haa");
//                System.out.println("ahhh");
//                System.out.println("aha");
//            case 003:
//                System.out.println("hoorey");
//                System.out.println("magic");
//            default:
//                System.out.println("none");
//
//        }

        int genderCategory = 007;
        switch (genderCategory){
            case 001, 004 -> System.out.println("Boys category");
            case 003, 007 -> System.out.println("Girls category");
            default -> System.out.println("None of the above");
        }
    }
}
