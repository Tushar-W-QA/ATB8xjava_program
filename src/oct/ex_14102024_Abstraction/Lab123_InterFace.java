package oct.ex_14102024_Abstraction;

public class Lab123_InterFace {
    public static void main(String[] args) {
        t T  = new t();
        T.f();
    }

}



class t implements i{

    @Override
    public void f() {
        System.out.println("created by t");
    }
}

interface i{
    void f(); // this function automatically became a incomplete
}
