package oct.ex_16102024_StaticKeyword;

public class Lab126 {
    // Instance variables are loaded with object creation
    // Static variable are loaded with class creation


    public static void main(String[] args) {
        student s1 = new student(25);
        student s2 = new student(28);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(student.school_name);
        student.school_name = "PQR";
        System.out.println(student.school_name);

    }
}

class student{
    int age; // it is Instance variable / non-static;
    static String school_name = "ABC"; // it is static variable

    // to use the instance variable we have to create a constructor
    public student(int age) {
        this.age =age;
    }
}
