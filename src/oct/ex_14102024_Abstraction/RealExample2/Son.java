package oct.ex_14102024_Abstraction.RealExample2;

public class Son extends Father{
    @Override
    void loan50k() {
        System.out.println("Son: I will give 50k loan of my father");
    }

    void loan(){
        System.out.println("Son: I have no took any personal loan");
    }
}
