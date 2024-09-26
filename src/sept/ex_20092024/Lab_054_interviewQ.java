package sept.ex_20092024;

public class Lab_054_interviewQ {
    public static void main(String[] args) {
        //Write a switch statement to convert a given number (1-12) into the corresponding month name.
        //1. what is user I/P == 1,2,2....12 and confirm the datatype(eg. int)
        //   ALways confirm the datatype of return/output

        //2. Basic logic
        /* 1 -> jan
        2-> fab,
        3-> mar,
        4-> apr,
        5-> may,
        6-> june,
        7-> july,
        8-> aug,
        9-> sept,
        10-> oct,
        11-> nov,
        12-> dec.
         */

        // write the code:
        int num = 0;

        switch(num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Unable to recognize what is this");
        }

    }
}
