package oct.ex_09102024_Inheritance.multiLevel_inheritance;

public class Father extends GrandFather {

    // In hierarchical inheritance, one base class is extended by multiple derived classes.
    // Each derived class inherits the properties and methods of the base class,
    // but can also have its own unique properties and methods.

    void bhk3 () {
        System.out.println(" F --> 3bhk");
    }

    void car() {
        System.out.println("Father's car");
    }
}
