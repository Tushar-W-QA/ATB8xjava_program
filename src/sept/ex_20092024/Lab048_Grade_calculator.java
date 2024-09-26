package sept.ex_20092024;

public class Lab048_Grade_calculator {

    public static void main (String[]args){
        //Write a program that calculates and
        // displays the letter grade for a given numerical score
        // (e.g., A, B, C, D, or F) based on the following grading scale:

//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59

        // 1. find the user input (scale) & confirm the datatype
        // return output (Grade)--> datatype need to confirm --> char or string

        // 2. Basic logic
        // score <= 100 and score >=90 ; --> A
        // score <= 89 and score >= 80 --> B
        // score <= 79 and score >= 70 --> C
        // score <= 69 and score >= 60 --> D
        // score <= 59 and score >= 0 --> F

        // 3. write code

        char grade = 'F';
        int score = 100;
        if(score <= 100 && score >= 90){
            grade = 'A';
        } else if (score <= 89 && score >= 80) {
            grade = 'B';
        } else if (score <= 79 && score >= 70) {
            grade = 'C';
        } else if (score <= 69 && score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);
    }
}
