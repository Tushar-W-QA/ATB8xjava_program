package oct.ex_09102024_Inheritance.single_inheritance.ex3;

public class python extends Programming {
    // is a relation shows the single inheritance type
    // example: python is programming language, 2. son is son of father.

    // default constructor
    python(){
        System.out.println("DC");
    }

    void example (){
        System.out.println(author);
        System.out.println(version);
        // default value will come because we don't have assign the value to instance variable
    }

}
