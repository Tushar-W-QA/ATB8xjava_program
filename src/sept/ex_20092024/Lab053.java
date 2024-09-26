package sept.ex_20092024;

public class Lab053 {
    public static void main(String[] args) {
        // if marks >= 75 --> distinction
        // if marks >= 60 and marks <= 74 --> firstClass
        // if marks >=35 and marks <= 59 --> secondCLass
        // or else fail
        String grade = "11";
        int marks = 62;
        if (marks >= 75) {
            grade = "Distinction";
        } else if (marks >= 60 && marks <= 74) {
            grade = "First Class!!";
        } else if (marks >= 35 && marks <= 59) {
            grade = "Second Class!!";
        } else {
            grade = "failed!!";
        }
        System.out.println("You are in " + grade);
    }
}
