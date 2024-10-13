package oct.ex_09102024_Inheritance.HasA;

public class Car {
    // Car Has an engine and Tyre
    protected void start_car(){
        new Engine().start();
        new Tyre().rolling();
    }
}
