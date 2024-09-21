package sept.ex_20092024;

public class Lab032 {
    public static void main(String[] args) {
        // find the max & min no. between two values by using ternary operator

        int pooja_salary = 6;
        int prashant_salary = 9;

        int max_salary = pooja_salary > prashant_salary ? pooja_salary : prashant_salary;
        //System.out.println(max_salary);

        int min_salary = pooja_salary < prashant_salary ? pooja_salary : prashant_salary;
        System.out.println(min_salary);

    }
}
