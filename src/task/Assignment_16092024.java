package task;

public class Assignment_16092024 {

    public static void main(String[] args) {

        // Purchase mobile = 10000;

        long delivery_charges = 200;
        float packaging_charges = 10000f;

        //long total_charges = delivery_charges + packaging_charges; // implicit --> JVM will not allowed

        long total_charges = delivery_charges + (long)packaging_charges;
        System.out.println(total_charges);

// ------------------------------------<><><><><><><><><>--------------------------------------//
//         int a = 10;
//        System.out.println(--a + a -- + a--);
//        System.out.println(a);
//        // line no. | a  | exp
//        // 6 | 10  |
//        // 7 | 9 + 9 + 8 =26  |
//        // 8 | 7

// ------------------------------------<><><><><><><><><>--------------------------------------//
//        int a = 10;
//        System.out.println(--a + a++ + a--);
//        System.out.println(a);
//
//        // line no. | a  | exp
//        // 15 | 10  |
//        // 16 | 9 + 9 + 10 =28  |
//        // 17 | 9
// ------------------------------------<><><><><><><><><>--------------------------------------//
//        int a = 10;
//        System.out.println(a-- + a -- + a--);
//        System.out.println(a);
//
//        // line no. | a  | exp
//        // 24 | 10  |
//        // 25 | 10 + 9 + 8 =27  |
//        // 26 | 7
//        // 17 | 9

    }
}
