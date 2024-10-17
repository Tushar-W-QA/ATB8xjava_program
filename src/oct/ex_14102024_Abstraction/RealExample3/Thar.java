package oct.ex_14102024_Abstraction.RealExample3;

public class Thar extends Engine{

    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Start the Car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop the Car");
    }
}
