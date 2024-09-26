package task;

public class Assignment_20092024 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int c = 45;

//        int max_between_ab = a < b ? b : a;
//        int max_between_ac = b < c ? c : b;
//
//        int max_between_abc = max_between_ab < max_between_ac ? max_between_ac : max_between_ab;
//        System.out.println(max_between_abc);

//
//        int max_between_abc = (a > c) ? (a < b ? b : a) : (b < c ? c : b);
//        System.out.println(max_between_abc);
// ------------------------------------<><><><>><><><><><><><><>----------------------------------------//

//        //int score = 85
//
//        //String grade →
//        //  score >= 90 → A
//        //  score >= 80 → B
//        //  score >= 70 → C
//
//         int score  = 70;
//         String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "D"  ;
//         System.out.println(grade);

//
//        ✅ Triangle Classifier ( If)
//         Write a program that classifies a triangle based on its side lengths.
//         Given three input values representing the lengths of the sides, determine
//         if the triangle is equilateral (all sides are equal),
//         isosceles (exactly two sides are equal), or
//         scalene (no sides are equal).
//         Use an if-else statement to classify the triangle.
//         side1, side2, side3 ->
//
        // 1. user input --> three sides,
        // 2. basic code -->
            // a,b,c are equals --> equilateral
            // if two sides are equal --> isosceles
            // no sides are equal --> scalene
        // 3. write code

        int a = 10;
        int b = 05;
        int c = 03;
        if (a == b && a == c){
            System.out.println("equilateral");
        } else if (a == b || a == c || b == c) {
            System.out.println("isosceles");
        } else{
            System.out.println("scalene");
        }
    }
}
